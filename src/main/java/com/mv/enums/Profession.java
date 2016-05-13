package com.mv.enums;

/**
 * Profession
 * Created by Dimon on 20.04.2015.
 */
public enum Profession {
    ACTOR {
        @Override
        public String toString() {
            return "актёр";
        }
    },
    DIRECTOR {
        @Override
        public String toString() {
            return "режиссёр";
        }
    },
    PRODUCER {
        @Override
        public String toString() {
            return "продюсер";
        }
    },
    EDITOR {
        @Override
        public String toString() {
            return "монтаж";
        }
    },
    MUSIC_BY {
        @Override
        public String toString() {
            return "композитор";
        }
    },
    CREATED_BY {
        @Override
        public String toString() {
            return "автор идеи/сценария";
        }
    },
}
