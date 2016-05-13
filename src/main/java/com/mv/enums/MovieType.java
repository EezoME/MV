package com.mv.enums;

/**
 * Movie type.
 * Created by Dimon on 20.04.2015.
 */
public enum MovieType {
    FILM {
        @Override
        public String toString() {
            return "фильм";
        }
    },
    CARTOON {
        @Override
        public String toString() {
            return "мультфильм";
        }
    },
    CARTOON_SERIES {
        @Override
        public String toString() {
            return "мультсериал";
        }
    },
    SOAP_OPERA {
        @Override
        public String toString() {
            return "сериал";
        }
    },
    SERIAL_FILM {
        @Override
        public String toString() {
            return "многосерийный фильм";
        }
    },
    SHORT_FILM {
        @Override
        public String toString() {
            return "короткометражный фильм";
        }
    }
}
