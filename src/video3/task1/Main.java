package video3.task1;

public class Main {
    public static void main(String[] args) {
        Pupil excellentPupil = new ExcelentPupil();
        Pupil goodPupil = new GoodPupil();
        Pupil badPupil = new BadPupil();
        Classroom classroom = new Classroom(goodPupil, excellentPupil, badPupil);
        classroom.getExcellentPupil().study();
        classroom.getExcellentPupil().read();
        classroom.getExcellentPupil().write();
        classroom.getExcellentPupil().relax();

        classroom.getGoodPupil().study();
        classroom.getGoodPupil().read();
        classroom.getGoodPupil().write();
        classroom.getGoodPupil().relax();

        classroom.getBadPupil().study();
        classroom.getBadPupil().read();
        classroom.getBadPupil().write();
        classroom.getBadPupil().relax();

    }
}
