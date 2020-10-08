package video3.task1;

public class Classroom {
    private Pupil goodPupil;
    private Pupil excellentPupil;
    private Pupil badPupil;

    public Classroom(Pupil goodPupil, Pupil excellentPupil, Pupil badPupil) {
        this.goodPupil = goodPupil;
        this.excellentPupil = excellentPupil;
        this.badPupil = badPupil;
    }

    public Pupil getGoodPupil() {
        return goodPupil;
    }

    public void setGoodPupil(Pupil goodPupil) {
        this.goodPupil = goodPupil;
    }

    public Pupil getExcellentPupil() {
        return excellentPupil;
    }

    public void setExcellentPupil(Pupil excellentPupil) {
        this.excellentPupil = excellentPupil;
    }

    public Pupil getBadPupil() {
        return badPupil;
    }

    public void setBadPupil(Pupil badPupil) {
        this.badPupil = badPupil;
    }
}





