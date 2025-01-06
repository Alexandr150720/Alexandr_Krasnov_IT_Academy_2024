package com.academy.course.lesson11.home.work.factory;

import com.academy.course.lesson11.home.work.part.Head;
import com.academy.course.lesson11.home.work.part.IHead;

public enum HeadFactory {

    XIAOMI{
        @Override
        public IHead build() {
            return new Head("Xiaomi");
        }
    },

    GOOGLE{
        @Override
        public IHead build() {
            return new Head("Google");
        }
    },

    HUAWEI{
        @Override
        public IHead build() {
            return new Head("Huawei");
        }
    };

    public abstract IHead build();



}
