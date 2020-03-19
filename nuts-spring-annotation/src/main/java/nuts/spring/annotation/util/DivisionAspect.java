package nuts.spring.annotation.util;

import org.aspectj.lang.annotation.*;

@Aspect
public class DivisionAspect {

    @Pointcut("execution(public int nuts.spring.annotation.model.DivisionCalculation.*(..))")
    public void divisionPointCut() {
    }

    @Before("divisionPointCut()")
    public void beforeDivision() {
        System.out.println("Before...");
    }

    @After("divisionPointCut()")
    public void afterDivision() {
        System.out.println("After...");
    }

    @AfterReturning("divisionPointCut()")
    public void afterReturningDivision() {
        System.out.println("AfterReturning...");
    }

    @AfterThrowing("divisionPointCut()")
    public void afterThrowingDivision() {
        System.out.println("AfterThrowing...");
    }

//    @Around("divisionPointCut()")
//    public void aroundDivision() {
//        System.out.println("Around...");
//    }

}
