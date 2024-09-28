package com.example;

import io.micronaut.runtime.Micronaut;

import java.util.logging.Logger;
public class Application {
  private static final Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
    logger.info("\n"+"____                     ____  _     _     _           \n" +
            " / __ \\                   |  _ \\(_)   | |   | |          \n" +
            "| |  | |_ __   ___ _ __   | |_) |_  __| | __| | ___ _ __ \n" +
            "| |  | | '_ \\ / _ \\ '_ \\  |  _ <| |/ _` |/ _` |/ _ \\ '__|\n" +
            "| |__| | |_) |  __/ | | | | |_) | | (_| | (_| |  __/ |   \n" +
            " \\____/| .__/ \\___|_| |_| |____/|_|\\__,_|\\__,_|\\___|_|   \n" +
            "       | |                                               \n" +
            "       |_|   ");

        Micronaut.run(Application.class, args);
    }
}