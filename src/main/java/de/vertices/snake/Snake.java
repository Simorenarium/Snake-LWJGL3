package de.vertices.snake;

public final class Snake {
    private static final Snake INSTANCE = new Snake();

    public static Snake getInstance() {
        return INSTANCE;
    }

    public final void run() {
        Runtime.getRuntime().addShutdownHook(new Thread(this::stop));
    }

    private void stop() {
    }
}
