package pers.li.annotation.$3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


public @interface BugReport {
	enum Status {UNCONFIRMED, CONFIRMED, FIXED, NOTABUG};
	boolean showStopper() default true;
	String assiganedTo() default "[none]";
	Status status() default Status.UNCONFIRMED;
	String[] reportedBy();
}
