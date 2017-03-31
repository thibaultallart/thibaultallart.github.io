# From Borgan course
library(survival)
# Read data:
path <- "http://www.uio.no/studier/emner/matnat/math/STK4080/h14/melanoma.txt"
melanoma <- read.table(path,header=T)

# Kaplan-Meier estimates and summary for for all patients:
fit.mel0 <- survfit(Surv(lifetime,status==1)~1,data=melanoma,conf.type="plain")
plot(fit.mel0, mark.time=T, xlab="Years after operation")
summary(fit.mel0)

 

# We compute Kaplan-Meier estimates for females and males with standard confidence intervals:
fit.sex <- survfit(Surv(lifetime,status==1)~sex,data=melanoma,conf.type="plain")

# We then make a plot of the estimates:
plot(fit.sex, mark.time=F, xlab="Years after operation",lty=1:2)
legend("bottomleft",c("females","males"),lty=1:2)

# We may use the summary command to obtain the estimated survival with confidence intervals
summary(fit.sex)

# From the summary we may read of an estimate for the lower quartile 
# with confidence limits

# For females the lower quartile becomes 8.33 years with 95% confidence limits 
# from 5.30 years and upwards (no upper limit can be obtained)

# For males the lower quartile becomes 3.36 years with 95% confidence limits from 2.17 to 5.76 years.

# We may also obtain the lower quartile with confidence limits from the command:
quantile(fit.sex,probs=0.25)
