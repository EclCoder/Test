package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class MBBaseActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Display f28089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OrientationEventListener f28090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28091c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f28092d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f28093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.activity.backdispatcher.a f28094f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e10) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends OrientationEventListener {
        b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation = MBBaseActivity.this.f28089a != null ? MBBaseActivity.this.f28089a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.f28091c != 1) {
                MBBaseActivity.this.f28091c = 1;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.f28091c != 2) {
                MBBaseActivity.this.f28091c = 2;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.f28091c != 3) {
                MBBaseActivity.this.f28091c = 3;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.f28091c == 4) {
                    return;
                }
                MBBaseActivity.this.f28091c = 4;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements com.mbridge.msdk.config.activity.backdispatcher.b {
        c() {
        }

        @Override // com.mbridge.msdk.config.activity.backdispatcher.b
        public void a() {
            MBBaseActivity.this.onBackDispatched();
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.f28090b = bVar;
        if (bVar.canDetectOrientation()) {
            this.f28090b.enable();
        } else {
            this.f28090b.disable();
            this.f28090b = null;
        }
    }

    public void getNotchParams() {
        if (this.f28092d) {
            return;
        }
        this.f28093e = new a();
        getWindow().getDecorView().postDelayed(this.f28093e, 500L);
    }

    public abstract void onBackDispatched();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28092d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(UserVerificationMethods.USER_VERIFY_ALL, UserVerificationMethods.USER_VERIFY_ALL);
            getWindow().addFlags(512);
            c();
            a();
            f1.c(getWindow());
            if (Build.VERSION.SDK_INT >= 33) {
                registerBackInvokedDispatcher();
            }
        } catch (Exception e10) {
            q0.b("MBBaseActivity", e10.getMessage());
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f28092d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.f28090b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.f28090b = null;
            }
            if (this.f28093e != null) {
                getWindow().getDecorView().removeCallbacks(this.f28093e);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                unRegisterBackInvokedDispatcher();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f30438f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c();
    }

    public void registerBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = new com.mbridge.msdk.config.activity.backdispatcher.a();
            this.f28094f = aVar;
            aVar.a(getWindow(), new c());
        } catch (Throwable th2) {
            q0.b("MBBaseActivity", th2.getMessage());
        }
    }

    public abstract void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14);

    public void unRegisterBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = this.f28094f;
            if (aVar == null) {
                return;
            }
            aVar.a(getWindow());
        } catch (Throwable th2) {
            q0.b("MBBaseActivity", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i10;
        int safeInsetLeft;
        int i11;
        int i12;
        int safeInsetBottom;
        DisplayCutout displayCutout;
        int i13;
        int i14 = Build.VERSION.SDK_INT;
        if (this.f28092d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i15 = -1;
        if (rootWindowInsets == null || i14 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            this = this;
            i10 = -1;
            safeInsetLeft = 0;
            i11 = 0;
            i12 = 0;
            safeInsetBottom = 0;
        } else {
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f28089a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.f28091c == -1) {
                if (rotation == 0) {
                    i13 = 3;
                } else if (rotation == 1) {
                    i13 = 1;
                } else if (rotation == 2) {
                    i13 = 4;
                } else {
                    i13 = rotation == 3 ? 2 : -1;
                }
                this.f28091c = i13;
                q0.b("MBBaseActivity", this.f28091c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i15 = 90;
                } else if (rotation == 2) {
                    i15 = 180;
                } else if (rotation == 3) {
                    i15 = 270;
                }
                i10 = i15;
            } else {
                i10 = 0;
            }
            i11 = safeInsetRight;
            i12 = safeInsetTop;
        }
        this.setTopControllerPadding(i10, safeInsetLeft, i11, i12, safeInsetBottom);
        if (this.f28090b == null) {
            d();
        }
    }

    private void c() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th2) {
            q0.b("MBBaseActivity", th2.getMessage());
        }
    }

    private int a() {
        if (this.f28089a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f28089a = getDisplay();
            } else {
                this.f28089a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f28089a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }
}
