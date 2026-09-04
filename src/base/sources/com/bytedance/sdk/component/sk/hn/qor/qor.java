package com.bytedance.sdk.component.sk.hn.qor;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import b6.a;
import b6.b;
import com.bytedance.sdk.component.sk.aq;
import com.bytedance.sdk.component.sk.dnm;
import com.bytedance.sdk.component.sk.eum;
import com.bytedance.sdk.component.sk.jip;
import com.bytedance.sdk.component.sk.mjg;
import com.bytedance.sdk.component.sk.ojm;
import com.bytedance.sdk.component.sk.ta;
import com.bytedance.sdk.component.sk.xn;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements ojm {
    private com.bytedance.sdk.component.sk.dse apu;
    private int aq;
    private com.bytedance.sdk.component.sk.hn as;
    private WeakReference<ImageView> bug;
    private ImageView.ScaleType dkl;
    private int dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private int f16do;
    private Bitmap.Config dse;
    private int eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private boolean f12968fc;
    private String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f12969hn;
    Future<?> hnj;
    private byte[] hqh;
    private xn jip;
    private boolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private final Handler f12970oj;
    private int ojm;
    private volatile boolean orl;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private jip f12971sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private aq f12972ta;
    private ExecutorService tgn;
    private int tu;
    private int uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private mjg f12973vf;
    private dkl wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private boolean f12974xn;
    private boolean xyo;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hn implements ta {
        private ExecutorService apu;
        private int aq;
        private boolean bug;
        private Bitmap.Config dkl;
        private xn dnm;
        private int dse;
        private boolean eum;

        /* JADX INFO: renamed from: fc, reason: collision with root package name */
        private com.bytedance.sdk.component.sk.hn f12975fc;
        private String gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private ImageView f12976hn;
        private jip hnj;
        private dkl jip;
        private String mjg;

        /* JADX INFO: renamed from: oj, reason: collision with root package name */
        private int f12977oj;
        private boolean orl;
        private String qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private ImageView.ScaleType f12978sk;
        private aq uua;
        private mjg wu;

        /* JADX INFO: renamed from: xn, reason: collision with root package name */
        private int f12980xn;
        private int ojm = 1;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private int f12979ta = 5;

        public hn(dkl dklVar) {
            this.jip = dklVar;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta gjv(int i10) {
            this.f12977oj = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta hn(int i10) {
            this.aq = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta hnj(String str) {
            this.qor = str;
            return this;
        }

        public ta qor(String str) {
            this.gjv = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta sk(int i10) {
            this.f12980xn = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta hn(String str) {
            this.mjg = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta hnj(ImageView.ScaleType scaleType) {
            this.f12978sk = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta qor(int i10) {
            this.ojm = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta hnj(Bitmap.Config config) {
            this.dkl = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta hnj(int i10) {
            this.dse = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta hnj(xn xnVar) {
            this.dnm = xnVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta hnj(boolean z10) {
            this.orl = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ojm hnj(jip jipVar, int i10) {
            this.f12979ta = i10;
            return hnj(jipVar);
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ojm hnj(jip jipVar) {
            this.hnj = jipVar;
            return new qor(this).apu();
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ojm hnj(ImageView imageView) {
            this.f12976hn = imageView;
            return new qor(this).apu();
        }

        @Override // com.bytedance.sdk.component.sk.ta
        public ta hnj(aq aqVar) {
            this.uua = aqVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class hnj implements jip {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private jip f12981hn;

        public hnj(jip jipVar) {
            this.f12981hn = jipVar;
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(final dnm dnmVar) {
            Bitmap bitmapHnj;
            final ImageView imageView = (ImageView) qor.this.bug.get();
            if (imageView != null && qor.this.dnm != 3 && hnj(imageView)) {
                Object objHn = dnmVar.hn();
                if (objHn instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) dnmVar.hn();
                    qor.this.f12970oj.post(new Runnable() { // from class: com.bytedance.sdk.component.sk.hn.qor.qor.hnj.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objHn instanceof Drawable) {
                    final Drawable drawable = (Drawable) dnmVar.hn();
                    qor.this.f12970oj.post(new Runnable() { // from class: com.bytedance.sdk.component.sk.hn.qor.qor.hnj.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Drawable drawable2 = drawable;
                                if (a.a(drawable2)) {
                                    b.a(drawable2).start();
                                }
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (qor.this.f12972ta != null && (dnmVar.hn() instanceof Bitmap) && (bitmapHnj = qor.this.f12972ta.hnj((Bitmap) dnmVar.hn())) != null) {
                    dnmVar.hnj(bitmapHnj);
                }
            } catch (Throwable unused) {
            }
            if (qor.this.uua == 5) {
                qor.this.f12970oj.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.sk.hn.qor.qor.hnj.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (hnj.this.f12981hn != null) {
                            hnj.this.f12981hn.hnj(dnmVar);
                        }
                    }
                });
                return;
            }
            jip jipVar = this.f12981hn;
            if (jipVar != null) {
                jipVar.hnj(dnmVar);
            }
        }

        private boolean hnj(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(qor.this.qor)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(final int i10, final String str, final Throwable th2) {
            if (qor.this.uua == 5) {
                qor.this.f12970oj.post(new Runnable() { // from class: com.bytedance.sdk.component.sk.hn.qor.qor.hnj.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (hnj.this.f12981hn != null) {
                            hnj.this.f12981hn.hnj(i10, str, th2);
                        }
                    }
                });
                return;
            }
            jip jipVar = this.f12981hn;
            if (jipVar != null) {
                jipVar.hnj(i10, str, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ojm apu() {
        try {
            if (this.wu == null) {
                jip jipVar = this.f12971sk;
                if (jipVar != null) {
                    jipVar.hnj(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, "not init !", null);
                    return this;
                }
            } else {
                String strHnj = hnj();
                if (TextUtils.isEmpty(strHnj)) {
                    this.f12971sk.hnj(2000, "url is empty", null);
                    return this;
                }
                eum eumVarDse = this.wu.dse();
                if (!strHnj.startsWith("http://") && !strHnj.startsWith("https://") && eumVarDse != null) {
                    eumVarDse.hnj(1006, "url is not validate ".concat(strHnj));
                }
                ExecutorService executorServiceDkl = this.tgn == null ? this.wu.dkl() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.sk.hn.qor.qor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        qor qorVar = qor.this;
                        com.bytedance.sdk.component.sk.hn.qor.hnj hnjVar = new com.bytedance.sdk.component.sk.hn.qor.hnj(qorVar, qorVar.jip);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.sk.hn.hn.hn());
                            arrayList.add(new com.bytedance.sdk.component.sk.hn.hn.sk());
                            arrayList.add(new com.bytedance.sdk.component.sk.hn.hn.hnj());
                            arrayList.add(new com.bytedance.sdk.component.sk.hn.hn.qor());
                            arrayList.add(new com.bytedance.sdk.component.sk.hn.hn.gjv());
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (qor.this.orl) {
                                    hnjVar.hnj(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.sk.hn.hn.dkl dklVar = (com.bytedance.sdk.component.sk.hn.hn.dkl) arrayList.get(i10);
                                if (qor.this.jip != null && dklVar != null && !"data_intercept".equals(dklVar.hnj())) {
                                    qor.this.jip.hnj(dklVar.hnj(), qor.this);
                                }
                                qor qorVar2 = qor.this;
                                boolean zHnj = dklVar.hnj(qorVar2, qorVar2.jip, hnjVar);
                                if (qor.this.jip != null && !"data_intercept".equals(dklVar.hnj())) {
                                    qor.this.jip.hn(dklVar.hnj(), qor.this);
                                }
                                if (!zHnj) {
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            hnjVar.hnj(2000, th2.getMessage(), th2);
                        }
                    }
                };
                if (this.xyo) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.tgn;
                if (executorService != null) {
                    this.hnj = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceDkl != null) {
                    this.hnj = executorServiceDkl.submit(runnable);
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
            return this;
        }
    }

    public boolean bug() {
        return this.f12974xn;
    }

    public int dnm() {
        return this.dnm;
    }

    public int fc() {
        return this.eum;
    }

    public dkl jip() {
        return this.wu;
    }

    public com.bytedance.sdk.component.sk.dse mjg() {
        return this.apu;
    }

    public mjg oj() {
        return this.f12973vf;
    }

    public byte[] orl() {
        return this.hqh;
    }

    public Bitmap.Config ta() {
        return this.dse;
    }

    public com.bytedance.sdk.component.sk.hn uua() {
        return this.as;
    }

    public String xn() {
        return aq() + dnm();
    }

    private qor(hn hnVar) {
        this.f12970oj = new Handler(Looper.getMainLooper());
        this.f12974xn = true;
        this.hqh = null;
        this.f12969hn = hnVar.gjv;
        this.f12971sk = new hnj(hnVar.hnj);
        this.bug = new WeakReference<>(hnVar.f12976hn);
        this.dkl = hnVar.f12978sk;
        this.dse = hnVar.dkl;
        this.aq = hnVar.dse;
        this.ojm = hnVar.aq;
        this.dnm = hnVar.ojm;
        this.uua = hnVar.f12979ta;
        this.jip = hnVar.dnm;
        this.as = hnj(hnVar);
        if (!TextUtils.isEmpty(hnVar.qor)) {
            hn(hnVar.qor);
            hnj(hnVar.qor);
        }
        this.mjg = hnVar.bug;
        this.f12968fc = hnVar.orl;
        this.wu = hnVar.jip;
        this.f12972ta = hnVar.uua;
        this.tu = hnVar.f12980xn;
        this.f16do = hnVar.f12977oj;
        this.tgn = hnVar.apu;
        this.xyo = hnVar.eum;
        this.f12973vf = hnVar.wu;
    }

    private com.bytedance.sdk.component.sk.hn hnj(hn hnVar) {
        if (hnVar.f12975fc != null) {
            return hnVar.f12975fc;
        }
        return !TextUtils.isEmpty(hnVar.mjg) ? com.bytedance.sdk.component.sk.hn.qor.hnj.hn.hnj(new File(hnVar.mjg)) : com.bytedance.sdk.component.sk.hn.qor.hnj.hn.ojm();
    }

    public String aq() {
        return this.qor;
    }

    public jip dkl() {
        return this.f12971sk;
    }

    public String dse() {
        return this.gjv;
    }

    public int gjv() {
        return this.f16do;
    }

    public void hn(String str) {
        WeakReference<ImageView> weakReference = this.bug;
        if (weakReference != null && weakReference.get() != null) {
            this.bug.get().setTag(1094453505, str);
        }
        this.qor = str;
    }

    public ImageView.ScaleType ojm() {
        return this.dkl;
    }

    @Override // com.bytedance.sdk.component.sk.ojm
    public int qor() {
        return this.ojm;
    }

    public int sk() {
        return this.tu;
    }

    @Override // com.bytedance.sdk.component.sk.ojm
    public int hn() {
        return this.aq;
    }

    @Override // com.bytedance.sdk.component.sk.ojm
    public String hnj() {
        return this.f12969hn;
    }

    public void hnj(String str) {
        this.gjv = str;
    }

    public void hnj(boolean z10) {
        this.f12974xn = z10;
    }

    public void hnj(byte[] bArr) {
        this.hqh = bArr;
    }

    public void hnj(int i10) {
        this.eum = i10;
    }
}
