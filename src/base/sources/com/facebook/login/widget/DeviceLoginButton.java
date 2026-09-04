package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.f0;
import com.facebook.login.o;
import com.facebook.login.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00060\u0012R\u00020\u00018TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/facebook/login/widget/DeviceLoginButton;", "Lcom/facebook/login/widget/LoginButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/net/Uri;", "B", "Landroid/net/Uri;", "getDeviceRedirectUri", "()Landroid/net/Uri;", "setDeviceRedirectUri", "(Landroid/net/Uri;)V", "deviceRedirectUri", "Lcom/facebook/login/widget/LoginButton$c;", "getNewLoginClickListener", "()Lcom/facebook/login/widget/LoginButton$c;", "newLoginClickListener", "a", "facebook-login_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeviceLoginButton extends LoginButton {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private Uri deviceRedirectUri;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a extends LoginButton.c {
        public a() {
            super();
        }

        @Override // com.facebook.login.widget.LoginButton.c
        protected f0 b() {
            if (x7.a.c(this)) {
                return null;
            }
            try {
                o oVarA = o.f15674o.a();
                oVarA.D(DeviceLoginButton.this.getDefaultAudience());
                oVarA.G(v.DEVICE_AUTH);
                oVarA.Q(DeviceLoginButton.this.getDeviceRedirectUri());
                return oVarA;
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context, AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        s.h(context, "context");
        s.h(attrs, "attrs");
    }

    public final Uri getDeviceRedirectUri() {
        return this.deviceRedirectUri;
    }

    @Override // com.facebook.login.widget.LoginButton
    protected LoginButton.c getNewLoginClickListener() {
        return new a();
    }

    public final void setDeviceRedirectUri(Uri uri) {
        this.deviceRedirectUri = uri;
    }
}
