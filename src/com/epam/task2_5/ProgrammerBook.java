package com.epam.task2_5;


public class ProgrammerBook extends Book {
    private String language;
    private int level = 5;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language='" + language + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProgrammerBook programmerBook = (ProgrammerBook) o;
        if (!super.equals(programmerBook)) {
            return false;
        }
        if (level != programmerBook.level) return false;
        if (((language != null) && language.equals(programmerBook.language)) || ((language == null) && (programmerBook.language == null)))
            return true;
        else return false;
    }


    @Override
    public int hashCode() {
        int result = language != null ? language.hashCode() : 0;
        result = 31 * result + level;
        return result;
    }
}




