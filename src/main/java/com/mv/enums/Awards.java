package com.mv.enums;

/**
 * Movie Awards
 * Created by Dimon on 20.04.2015.
 */
public enum Awards {
    OSCAR {
        @Override
        public String toString() {
            return "Оскар";
        }
        public String getFullName(){
            return "Academy Awards, Oscar";
        }
        public String getURL(){
            return "http://www.oscar.com/";
        }
    },
    GOLDEN_GLOBES {
        @Override
        public String toString() {
            return "Золотой глобус";
        }
        public String getFullName(){
            return "Golden Globes";
        }
        public String getURL(){
            return "http://www.goldenglobes.org/";
        }
    },
    BAFTA {
        @Override
        public String toString() {
            return "Британская академия";
        }
        public String getFullName(){
            return "BAFTA Awards";
        }
        public String getURL(){
            return "http://www.bafta.org/";
        }
    },
    CESAR {
        @Override
        public String toString() {
            return "Сезар";
        }
        public String getFullName(){
            return "Cèsar Awards";
        }
        public String getURL(){
            return "http://www.cesarducinema.com/";
        }
    },
    SCREEN_ACTORS_GUILD {
        @Override
        public String toString() {
            return "Премия Гильдии актёров";
        }
        public String getFullName(){
            return "Screen Actors Guild";
        }
        public String getURL(){
            return "http://www.sagawards.org/";
        }
    },
    NIKA {
        @Override
        public String toString() {
            return "Ника";
        }
        public String getFullName(){
            return "Национальная кинематографическая премия «Ника»";
        }
        public String getURL(){
            return "http://www.kinonika.com/";
        }
    },
    GOLDER_EAGLE {
        @Override
        public String toString() {
            return "Золотой орёл";
        }
        public String getFullName(){
            return "Национальная кинематографическая премия «Золотой орел»";
        }
        public String getURL(){
            return "http://www.kinoacademy.ru/";
        }
    },
    SATURN {
        @Override
        public String toString() {
            return "Сатурн";
        }
        public String getFullName(){
            return "Academy of Science Fiction, Fantasy & Horror Films";
        }
        public String getURL(){
            return "http://www.saturnawards.org/";
        }
    },
    GOYA {
        @Override
        public String toString() {
            return "Гойя";
        }
        public String getFullName(){
            return "Goya Award";
        }
        public String getURL(){
            return "http://www.academiadecine.com/";
        }
    },
    EMMY {
        @Override
        public String toString() {
            return "Эмми";
        }
        public String getFullName(){
            return "Emmy Awards";
        }
        public String getURL(){
            return "http://www.emmys.tv/";
        }
    },
    EUROPEAN_FILM {
        @Override
        public String toString() {
            return "Европейская киноакадемия";
        }
        public String getFullName(){
            return "European Film Awards";
        }
        public String getURL(){
            return "http://www.europeanfilmacademy.org/";
        }
    },
    MTV_MOVIE {
        @Override
        public String toString() {
            return "Премия канала 'MTV'";
        }
        public String getFullName(){
            return "MTV Movie Awards";
        }
        public String getURL(){
            return "http://www.mtv.com/";
        }
    }
}
