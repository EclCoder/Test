package com.facebook;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0016\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\nB\u0013\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "", PglCryptUtils.KEY_MESSAGE, "(Ljava/lang/String;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "a", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FacebookException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SecureRandom f14847b = new SecureRandom();
    public static final long serialVersionUID = 1;

    public FacebookException() {
    }

    public static final void b(String str, boolean z10) {
        if (z10) {
            try {
                y7.e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException(final String str) {
        super(str);
        if (str == null || !h0.K() || f14847b.nextInt(100) <= 50) {
            return;
        }
        com.facebook.internal.s.a(com.facebook.internal.s.b.ErrorReport, new com.facebook.internal.s.a() { // from class: com.facebook.w
            @Override // com.facebook.internal.s.a
            public final void a(boolean z10) {
                FacebookException.b(str, z10);
            }
        });
    }

    public FacebookException(String str, Throwable th2) {
        super(str, th2);
    }

    public FacebookException(Throwable th2) {
        super(th2);
    }
}
