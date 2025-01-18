package com.academy.course.lesson16.home.work;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Processor> processors = new ArrayList<>();
        processors.add(new Processor(3300, "Intel Core i3-12100F"));
        processors.add(new Processor(3400, "AMD Ryzen 9 5950X"));
        processors.add(new Processor(2500, "Intel Core i5-13400"));
        processors.add(new Processor(3600, "Intel Core i7-12700KF"));
        processors.add(new Processor(3500, "AMD Ryzen 5 5600"));
        processors.add(new Processor(4200, "AMD Ryzen 7 7800X3D"));
        processors.add(new Processor(3700, "Intel Core Ultra 9 285K"));
        processors.add(new Processor(4700, "AMD Ryzen 7 9800X3D"));
        processors.add(new Processor(4200, "Intel Core Ultra 5 245KF"));
        processors.add( new Processor(3800, "AMD Ryzen 7 7700"));

        List<Processor> highFrequencyProc = processors.stream()
                .filter(c -> c.getClockFrequency() >= 4000)
                .peek(c -> c.setModel(c.getModel() + "-" + (int) (Math.random() * 100)))
                .sorted(Comparator.comparingInt(Processor::getClockFrequency))
                .toList();

        List<Processor> modelUpperCase = processors.stream()
                .map(c -> {
                    c.setModel(c.getModel().toUpperCase());
                    return c;
                })
                .toList();

        List<Processor> skipList = processors.stream()
                .skip(processors.size() - 2)
                .distinct()
                .toList();

        System.out.println(modelUpperCase);
        System.out.println(highFrequencyProc);
        System.out.println(skipList);
    }
}
