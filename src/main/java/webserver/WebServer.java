package webserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import webserver.controller.ApplicationMethod;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
    public static final Logger logger = LoggerFactory.getLogger(WebServer.class);
    private static final int DEFAULT_PORT = 8080;
    private static final int MAX_THREAD_POOL = 200;

    public static void main(String[] args) throws Exception {
        int port = 0;
        if (args == null || args.length == 0) {
            port = DEFAULT_PORT;
        } else {
            port = Integer.parseInt(args[0]);
        }

        // 고정된 개수를 가진 스레드 풀을 생성한다.
        ExecutorService executorService = Executors.newFixedThreadPool(MAX_THREAD_POOL);

        // 자바 reflection 세팅한다.
        ApplicationMethod.initialize();

        // 서버소켓을 생성한다. 웹서버는 기본적으로 8080번 포트를 사용한다.
        try (ServerSocket listenSocket = new ServerSocket(port)) {
            logger.info("Web Application Server started {} port.", port);

            // 클라이언트가 연결될때까지 대기한다.
            Socket connection;
            while ((connection = listenSocket.accept()) != null) {
                // 요청에 대한 task 객체를 생성한다.
                Dispatcher task = new Dispatcher(connection);
                // task 객체를 수행하도록 한다.
                executorService.submit(task);
            }
        }
    }
}
