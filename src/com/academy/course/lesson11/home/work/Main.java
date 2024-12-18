package com.academy.course.lesson11.home.work;

import com.academy.course.lesson11.home.work.factory.BodyFactory;
import com.academy.course.lesson11.home.work.factory.HeadFactory;
import com.academy.course.lesson11.home.work.part.IBody;
import com.academy.course.lesson11.home.work.part.IHead;

public class Main {

    public static void main(String[] args) {

        IBody body1 = BodyFactory.SAMSUNG.build();
        IBody body2 = BodyFactory.APPLE.build();
        IBody body3 = BodyFactory.TESLA.build();
        IHead head1 = HeadFactory.GOOGLE.build();
        IHead head2 = HeadFactory.HUAWEI.build();
        IHead head3 = HeadFactory.XIAOMI.build();

        Robot robot1 = new Robot("Optimus Prime", body1, head1);
        Robot robot2 = new Robot("Bumblebee", body1, head2);
        Robot robot3 = new Robot("Megatron", body1, head3);
        Robot robot4 = new Robot("Starscream", body2, head1);
        Robot robot5 = new Robot("Ironhide", body2, head2);
        Robot robot6 = new Robot("Galvatron", body2, head3);
        Robot robot7 = new Robot("Shockwave", body3, head1);
        Robot robot8 = new Robot("Mirage", body3, head2);
        Robot robot9 = new Robot("Wheeljack", body3, head3);

        Robot[] transformers = new Robot[9];
        transformers[0] = robot1;
        transformers[1] = robot2;
        transformers[2] = robot3;
        transformers[3] = robot4;
        transformers[4] = robot5;
        transformers[5] = robot6;
        transformers[6] = robot7;
        transformers[7] = robot8;
        transformers[8] = robot9;
        for (Robot transformer : transformers) {
            System.out.println(transformer);
        }
    }
}
