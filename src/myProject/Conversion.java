package myProject;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

/*
* Conversion - an interface with ....
*/

@Retention(RententionPolicy.RUNTIME)
public @interface Conversion {
	
	double min() default-100;
	double max() default+10000;

}
