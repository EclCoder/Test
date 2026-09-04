package org.apache.commons.logging;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class LogConfigurationException extends RuntimeException {
    private static final long serialVersionUID = 8486587136871052495L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Throwable f49203a;

    public LogConfigurationException() {
        this.f49203a = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f49203a;
    }

    public LogConfigurationException(Throwable th2) {
        this(th2 == null ? null : th2.toString(), th2);
    }

    public LogConfigurationException(String str, Throwable th2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" (Caused by ");
        stringBuffer.append(th2);
        stringBuffer.append(")");
        super(stringBuffer.toString());
        this.f49203a = th2;
    }
}
