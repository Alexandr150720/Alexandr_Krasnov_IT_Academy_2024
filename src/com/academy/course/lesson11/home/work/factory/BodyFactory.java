package com.academy.course.lesson11.home.work.factory;

import com.academy.course.lesson11.home.work.part.Body;
import com.academy.course.lesson11.home.work.part.IBody;

public enum BodyFactory{

    SAMSUNG{
        @Override
        public IBody build() {
            return new Body("Samsung");
        }
    },
    TESLA{
        @Override
        public IBody build() {
            return new Body("Tesla");
        }
    },
    APPLE{
        @Override
        public IBody build() {
            return new Body("Apple");
        }
    };

    public abstract IBody build();
}
