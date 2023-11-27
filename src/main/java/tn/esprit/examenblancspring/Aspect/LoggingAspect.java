package tn.esprit.examenblancspring.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
    @After("execution(* tn.esprit.examenblancspring.Services.*.add*(..))")
    public void logMethodEntry(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("methode executée");
    }
}
