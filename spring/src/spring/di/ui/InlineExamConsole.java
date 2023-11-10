package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

    private Exam exam;
    
    public InlineExamConsole() {
    }
    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }


    public void print(){
        System.out.println("total is " + exam.total() + ", avg is " + exam.avg());
    }

    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
