package com.bytedance.sdk.openadsdk.component.reward.hnj;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.hnj.hnj f13435hn;
    protected int hnj;
    private boolean qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class hnj implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private int f13438hn;
        private int hnj;

        private hnj() {
        }

        abstract void hnj(int i10, int i11);

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.hnj && i19 == this.f13438hn) {
                return;
            }
            this.hnj = i18;
            this.f13438hn = i19;
            hnj(i18, i19);
        }
    }

    public dnm(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.hnj = 0;
        this.qor = false;
        this.f13435hn = hnjVar;
        hn();
        try {
            this.hnj = sq.qor(hnjVar.orp, sq.hnj());
            if (!hnjVar.orp.getWindow().hasFeature(1)) {
                hnjVar.orp.requestWindowFeature(1);
            }
            hnjVar.orp.getWindow().addFlags(16777344);
            if (hnjVar.lu == 2 || !sq.qor(hnjVar.orp)) {
                hnjVar.orp.getWindow().addFlags(UserVerificationMethods.USER_VERIFY_ALL);
            }
            this.qor = hnjVar.meb;
        } catch (Throwable th2) {
            Log.e("TTAD.RFSM", "init: ", th2);
        }
    }

    private float gjv() {
        return sq.qor(this.f13435hn.orp, sq.orl(this.f13435hn.orp));
    }

    private void hn() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13435hn;
        hnjVar.rmr = hnjVar.f13456hn.m34if();
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13435hn;
        hnjVar2.lu = hnj(hnjVar2.orp, hnjVar2.f13456hn);
    }

    private static boolean hnj(int i10, int i11) {
        return i10 == 2 && i11 == 2;
    }

    private void qor() {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13435hn;
        if (hnjVar.lu != 2) {
            hn(hnjVar.orp, 1);
        } else if (hnjVar.f13458ka) {
            hn(hnjVar.orp, 8);
        } else {
            hn(hnjVar.orp, 0);
        }
    }

    private float sk() {
        return sq.qor(this.f13435hn.orp, sq.bug(this.f13435hn.orp));
    }

    private float[] hn(int i10) {
        float fSk = sk();
        float fGjv = gjv();
        int i11 = this.f13435hn.lu;
        if ((i11 == 1) != (fSk > fGjv)) {
            float f10 = fSk + fGjv;
            fGjv = f10 - fGjv;
            fSk = f10 - fGjv;
        }
        if (i11 == 1) {
            fSk -= i10;
        } else {
            fGjv -= i10;
        }
        return new float[]{fGjv, fSk};
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hn {
        private hnj hnj;

        public void hnj(Activity activity) {
            Window window;
            if (this.hnj == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.hnj);
            this.hnj = null;
        }

        public void hnj(final Activity activity, final int i10, final float f10, final boolean z10) {
            if (this.hnj == null) {
                try {
                    final boolean z11 = oj.gjv().dzo() == 1;
                    final boolean zQor = sq.qor(activity);
                    if (zQor || z11) {
                        try {
                            this.hnj = new hnj() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dnm.hn.1
                                boolean hnj;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super();
                                }

                                private void hn() {
                                    try {
                                        int iQor = dnm.qor(activity, i10);
                                        View decorView = activity.getWindow().getDecorView();
                                        if (iQor == 0) {
                                            int[] iArrHn = dnm.hn(activity, decorView, i10, zQor, z11);
                                            if (iArrHn[4] == 1) {
                                                this.hnj = dnm.hn(decorView, iArrHn[0], iArrHn[1], iArrHn[2], iArrHn[3], f10);
                                            }
                                        } else if (this.hnj) {
                                            decorView.setPadding(decorView.getPaddingLeft(), 0, decorView.getPaddingRight(), decorView.getPaddingBottom());
                                            this.hnj = false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.component.reward.hnj.dnm.hnj
                                void hnj(int i11, int i12) {
                                    if (z10) {
                                        hn();
                                    } else {
                                        hnj();
                                    }
                                }

                                /* JADX WARN: Code duplicated, block: B:28:0x00a7 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Code duplicated, block: B:31:0x00b4 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
                                private void hnj() {
                                    int iAbs;
                                    float fHnj;
                                    try {
                                        if (i10 == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                            iAbs = Math.abs(sq.orl(activity) - activity.getWindow().getDecorView().getWidth());
                                        } else {
                                            iAbs = Math.abs(sq.bug(activity) - activity.getWindow().getDecorView().getHeight());
                                        }
                                        View decorView = activity.getWindow().getDecorView();
                                        int paddingLeft = decorView.getPaddingLeft();
                                        int paddingRight = decorView.getPaddingRight();
                                        int paddingBottom = decorView.getPaddingBottom();
                                        if (iAbs == 0) {
                                            int paddingTop = decorView.getPaddingTop();
                                            if (i10 == 1 && activity.getResources().getConfiguration().orientation == 1) {
                                                fHnj = sq.hnj();
                                            } else {
                                                if (i10 == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                                    if (zQor) {
                                                        paddingLeft += (int) sq.hnj();
                                                    }
                                                    if (z11) {
                                                        fHnj = sq.hnj();
                                                    }
                                                }
                                                if (decorView.isAttachedToWindow()) {
                                                    decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                                    this.hnj = true;
                                                }
                                                if (f10 == 100.0f) {
                                                    decorView.setBackgroundColor(-16777216);
                                                    return;
                                                }
                                                return;
                                            }
                                            paddingTop += (int) fHnj;
                                            if (decorView.isAttachedToWindow()) {
                                                decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                                this.hnj = true;
                                            }
                                            if (f10 == 100.0f) {
                                                decorView.setBackgroundColor(-16777216);
                                                return;
                                            }
                                            return;
                                        }
                                        if (this.hnj) {
                                            decorView.setPadding(paddingLeft, 0, paddingRight, paddingBottom);
                                            this.hnj = false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            };
                            activity.getWindow().getDecorView().addOnLayoutChangeListener(this.hnj);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int qor(Activity activity, int i10) {
        int i11 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (hnj(i10, i11)) {
            return Math.abs(sq.orl(activity) - decorView.getWidth());
        }
        return Math.abs(sq.bug(activity) - decorView.getHeight());
    }

    public void hnj(xyo xyoVar) {
        if (xyoVar == null) {
            return;
        }
        xyoVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dnm.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = dnm.this.f13435hn.orp.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    private static void hn(Activity activity, int i10) {
        if (activity.getRequestedOrientation() == i10) {
            return;
        }
        int i11 = activity.getResources().getConfiguration().orientation;
        activity.setRequestedOrientation(i10);
    }

    public static int hnj(Activity activity, as asVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return asVar.zf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hn(View view, int i10, int i11, int i12, int i13, float f10) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        view.setPadding(i10, i11, i12, i13);
        if (f10 != 100.0f) {
            return true;
        }
        view.setBackgroundColor(-16777216);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    public void hnj(boolean z10) {
        float fMin;
        float fMax;
        int iMax;
        int iMax2;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 != 26) {
            if (i11 == 27) {
                try {
                    qor();
                } catch (Throwable unused) {
                }
            } else {
                qor();
            }
        }
        float fGjv = gjv();
        float fSk = sk();
        if (this.f13435hn.lu == 2) {
            fMin = Math.max(fGjv, fSk);
            fMax = Math.min(fGjv, fSk);
        } else {
            fMin = Math.min(fGjv, fSk);
            fMax = Math.max(fGjv, fSk);
        }
        Activity activity = this.f13435hn.orp;
        int iQor = sq.qor(activity, sq.hnj());
        if (this.f13435hn.lu != 2) {
            if (sq.qor(activity)) {
                fMax -= iQor;
            }
        } else if (sq.qor(activity)) {
            fMin -= iQor;
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.f13435hn;
            hnjVar.eta = (int) fMin;
            hnjVar.zt = (int) fMax;
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.f13435hn;
        int i12 = 20;
        if (hnjVar2.lu != 2) {
            float f10 = hnjVar2.rmr;
            if (f10 == 0.0f || f10 == 100.0f) {
                i12 = 0;
                iMax = 0;
                iMax2 = 0;
                i10 = 0;
            } else {
                iMax2 = (int) Math.max((fMax - (((fMin - 20.0f) - 20.0f) / f10)) / 2.0f, 0.0f);
                i10 = iMax2;
                iMax = 20;
            }
        } else {
            float f11 = hnjVar2.rmr;
            if (f11 == 0.0f || f11 == 100.0f) {
                i12 = 0;
                iMax = 0;
                iMax2 = 0;
                i10 = 0;
            } else {
                iMax = (int) Math.max((fMin - (((fMax - 20.0f) - 20.0f) * f11)) / 2.0f, 0.0f);
                iMax2 = 20;
                i10 = 20;
                i12 = iMax;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar3 = this.f13435hn;
        float f12 = i12;
        float f13 = iMax;
        hnjVar3.eta = (int) ((fMin - f12) - f13);
        float f14 = iMax2;
        float f15 = i10;
        hnjVar3.zt = (int) ((fMax - f14) - f15);
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar = hnjVar3.f13463th;
        if (aqVar == null || aqVar.f13131ta == 0) {
            activity.getWindow().getDecorView().setPadding(sq.hn(activity, f12), sq.hn(activity, f14), sq.hn(activity, f13), sq.hn(activity, f15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] hn(Activity activity, View view, int i10, boolean z10, boolean z11) {
        int paddingLeft;
        int paddingBottom;
        int paddingTop;
        int paddingRight;
        float fHnj;
        int i11 = 0;
        if (activity != null && view != null) {
            int i12 = activity.getResources().getConfiguration().orientation;
            int paddingLeft2 = view.getPaddingLeft();
            int paddingTop2 = view.getPaddingTop();
            int paddingRight2 = view.getPaddingRight();
            int paddingBottom2 = view.getPaddingBottom();
            if (i10 == 1) {
                if (i12 == 1) {
                    fHnj = sq.hnj();
                    paddingTop2 += (int) fHnj;
                    i11 = 1;
                } else {
                    paddingLeft2 += (int) sq.hnj();
                }
            } else if (i10 == 2) {
                if (i12 == 2) {
                    if (z10) {
                        paddingLeft2 += (int) sq.hnj();
                        i11 = 1;
                    }
                    if (z11) {
                        fHnj = sq.hnj();
                        paddingTop2 += (int) fHnj;
                        i11 = 1;
                    }
                } else {
                    paddingTop2 += (int) sq.hnj();
                }
            }
            return new int[]{paddingLeft2, paddingTop2, paddingRight2, paddingBottom2, i11};
        }
        if (view != null) {
            paddingLeft = view.getPaddingLeft();
            paddingTop = view.getPaddingTop();
            paddingRight = view.getPaddingRight();
            paddingBottom = view.getPaddingBottom();
        } else {
            paddingLeft = 0;
            paddingBottom = 0;
            paddingTop = 0;
            paddingRight = 0;
        }
        return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, 0};
    }

    public float[] hnj(int i10) {
        float[] fArrHn = new float[2];
        Activity activity = this.f13435hn.orp;
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.qor && paddingLeft == 0 && paddingTop == 0 && qor(activity, i10) == 0) {
            int[] iArrHn = hn(activity, decorView, i10, sq.qor(activity), oj.gjv().dzo() == 1);
            int i11 = iArrHn[0];
            paddingTop = iArrHn[1];
            paddingLeft = i11;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 35 && this.f13435hn.f13456hn.m34if() == 100.0f) {
            fArrHn[0] = decorView.getWidth() - paddingLeft;
            fArrHn[1] = decorView.getHeight() - paddingTop;
        } else {
            fArrHn[0] = decorView.getWidth() - (paddingLeft * 2);
            fArrHn[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArrHn[0] = sq.qor(activity, fArrHn[0]);
        float fQor = sq.qor(activity, fArrHn[1]);
        fArrHn[1] = fQor;
        if (fArrHn[0] < 10.0f || fQor < 10.0f) {
            fArrHn = hn(this.hnj);
        }
        if (i12 != 26 && i12 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i10) {
                    if (i10 == 2) {
                        float f10 = fArrHn[0];
                        float f11 = fArrHn[1];
                        if (f10 < f11) {
                            fArrHn[1] = f10;
                            fArrHn[0] = f11;
                        }
                    } else {
                        float f12 = fArrHn[0];
                        float f13 = fArrHn[1];
                        if (f12 > f13) {
                            fArrHn[1] = f12;
                            fArrHn[0] = f13;
                        }
                    }
                }
            }
            float f14 = fArrHn[0];
            float f15 = fArrHn[1];
        }
        return fArrHn;
    }

    public void hnj() {
        sq.hnj(this.f13435hn.orp);
        this.f13435hn.orp.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dnm.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (dnm.this.f13435hn.orp.isFinishing()) {
                            return;
                        }
                        dnm.this.f13435hn.orp.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.hnj.dnm.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                sq.hnj(dnm.this.f13435hn.orp);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        apu.qor("TTAD.RFSM", e10.getMessage());
                    }
                }
            }
        });
    }
}
