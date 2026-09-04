package com.bytedance.sdk.openadsdk.core.widget.hnj;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.core.fc;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class dkl implements xyo.hnj {
    boolean aq;
    float bug;
    float dnm;
    boolean dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    float f14270fc;
    WebView gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    as f14271hn;
    Context hnj;
    long jip;
    float mjg;
    private long nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    boolean f14272oj;
    String ojm;
    float orl;
    private boolean pty;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    int f14274ta;
    boolean uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    long f14276xn;
    private final boolean xyo;
    private final Handler tgn = new xyo(fc.hn().getLooper(), this);
    String qor = WwUgngZLNA.QTwK;
    int dkl = 0;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private final String f14275vf = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String hqh = ".*\\/\\?caf_results=.*&clkt=\\d+$";

    /* JADX INFO: renamed from: do, reason: not valid java name */
    hnj f48do = new hnj() { // from class: com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.hnj
        public void hnj() {
            dkl dklVar = dkl.this;
            dklVar.aq = true;
            dklVar.dkl();
            dkl dklVar2 = dkl.this;
            dklVar2.hnj(2, dklVar2.ojm, dklVar2.f14274ta);
        }
    };
    GestureDetector tu = new GestureDetector(oj.hnj(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            dkl.this.uua = true;
            return false;
        }
    });

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    int f14273sk = oj.gjv().eum();
    Map<Integer, Long> apu = new HashMap();
    Map<Integer, Float> eum = new HashMap();
    Map<Integer, Long> wu = new HashMap();
    List<Integer> as = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    public interface hnj {
        void hnj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.gjv.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            this.f14274ta = currentIndex + 1;
            if (this.xyo) {
                this.f14274ta = currentIndex + 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dkl() {
        if (this.eum.get(Integer.valueOf(this.f14274ta)) != null) {
            return;
        }
        float height = this.gjv.getHeight() / sq.hn(this.hnj, this.gjv.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        this.eum.put(Integer.valueOf(this.f14274ta), Float.valueOf(height));
    }

    private boolean dse() {
        int i10 = this.dkl + 1;
        this.dkl = i10;
        if (i10 > this.f14273sk) {
            return true;
        }
        return ("landingpage".equals(this.qor) || "landingpage_endcard".equals(this.qor) || "landingpage_split_screen".equals(this.qor) || "landingpage_direct".equals(this.qor) || "landingpage_split_ceiling".equals(this.qor)) ? false : true;
    }

    private void gjv(String str) {
        if (dse()) {
            return;
        }
        com.bytedance.sdk.openadsdk.gjv.qor.hnj(this.f14271hn, new com.bytedance.sdk.openadsdk.jip.hnj.hnj.C0249hnj().hnj(this.ojm).hn(Uri.decode(str)).hnj(), this.qor);
    }

    private boolean sk() {
        try {
            int i10 = this.f14274ta;
            if (i10 == 2 || i10 == 3) {
                return Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.ojm) || Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.ojm);
            }
            return false;
        } catch (Throwable th2) {
            apu.qor("WebArbitrageBehavior", th2.toString());
            return false;
        }
    }

    public void hn(String str) {
        this.ojm = str;
        aq();
        this.apu.put(Integer.valueOf(this.f14274ta), Long.valueOf(SystemClock.elapsedRealtime()));
        this.wu.put(Integer.valueOf(this.f14274ta), Long.valueOf(SystemClock.elapsedRealtime()));
        this.pty = sk();
    }

    public void qor(String str) {
        if (this.dse) {
            this.f14272oj = true;
        }
        if (this.f14274ta == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int iIndexOf = str.indexOf("query=") + 6;
            int iIndexOf2 = str.indexOf("&", iIndexOf);
            if (iIndexOf < 0 || iIndexOf2 >= str.length() || iIndexOf2 <= iIndexOf) {
                return;
            }
            gjv(str.substring(iIndexOf, iIndexOf2));
        }
    }

    public dkl(WebView webView, as asVar, Context context, boolean z10) {
        this.f14271hn = asVar;
        this.gjv = webView;
        this.hnj = context;
        this.xyo = z10;
    }

    public void hnj(String str) {
        this.qor = str;
    }

    public void hnj() {
        hn(this.f14274ta);
    }

    public void hnj(int i10) {
        float height = (i10 + this.gjv.getHeight()) / sq.hn(this.hnj, this.gjv.getContentHeight());
        Float f10 = this.eum.get(Integer.valueOf(this.f14274ta));
        if (height > (f10 == null ? 0.0f : f10.floatValue())) {
            this.eum.put(Integer.valueOf(this.f14274ta), Float.valueOf(height));
        }
    }

    public void hn() {
        this.gjv.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.hnj.dkl.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z10) {
                if (!z10) {
                    dkl dklVar = dkl.this;
                    if (!dklVar.aq) {
                        dklVar.dkl();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - dkl.this.nyv >= 50) {
                            dkl dklVar2 = dkl.this;
                            dklVar2.hnj(3, dklVar2.ojm, dklVar2.f14274ta);
                            dkl.this.nyv = jElapsedRealtime;
                            return;
                        }
                        return;
                    }
                    dklVar.aq = false;
                }
                if (z10) {
                    dkl.this.aq();
                    dkl dklVar3 = dkl.this;
                    dklVar3.apu.put(Integer.valueOf(dklVar3.f14274ta), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    private void gjv() {
        if (dse()) {
            return;
        }
        com.bytedance.sdk.openadsdk.jip.hnj.hnj hnjVarHnj = new com.bytedance.sdk.openadsdk.jip.hnj.hnj.C0249hnj().hnj(this.ojm).hnj(this.f14274ta).gjv(this.dnm).sk(this.bug).dkl(this.f14270fc).dse(this.f14276xn).hnj();
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = hnjVarHnj;
        this.tgn.sendMessageDelayed(messageObtain, 20L);
    }

    private void hn(int i10) {
        if (dse() || this.as.contains(Integer.valueOf(i10))) {
            return;
        }
        this.as.add(Integer.valueOf(i10));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.wu.get(Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.gjv.qor.hn(this.f14271hn, new com.bytedance.sdk.openadsdk.jip.hnj.hnj.C0249hnj().hnj(this.ojm).hnj(this.f14274ta).ta(jElapsedRealtime - (l10 != null ? l10.longValue() : jElapsedRealtime)).hnj(), this.qor);
    }

    public hnj qor() {
        return this.f48do;
    }

    private void qor(int i10) {
        if (dse()) {
            return;
        }
        dkl();
        this.dse = true;
        com.bytedance.sdk.openadsdk.jip.hnj.hnj hnjVarHnj = new com.bytedance.sdk.openadsdk.jip.hnj.hnj.C0249hnj().hnj(this.ojm).hnj(this.f14274ta).hnj(this.dnm).hn(this.bug).qor(this.f14276xn).qor(i10).hnj();
        try {
            if (this.pty) {
                WebView.HitTestResult hitTestResult = this.gjv.getHitTestResult();
                hnjVarHnj.hnj(hitTestResult.getExtra());
                hnjVarHnj.hnj(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 200;
        messageObtain.obj = hnjVarHnj;
        this.tgn.sendMessageDelayed(messageObtain, 100L);
    }

    public void hnj(MotionEvent motionEvent) {
        this.tu.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dnm = motionEvent.getX();
            this.bug = motionEvent.getY();
            this.jip = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            qor(2);
        } else {
            this.f14276xn = SystemClock.elapsedRealtime() - this.jip;
            if (hn(motionEvent)) {
                gjv();
            } else {
                qor(1);
            }
        }
    }

    private boolean hn(MotionEvent motionEvent) {
        this.orl = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.mjg = y10;
        float f10 = this.bug;
        if (y10 - f10 == 0.0f) {
            return false;
        }
        this.f14270fc = y10 - f10;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(int i10, String str, int i11) {
        if (dse()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.apu.get(Integer.valueOf(i11));
        long jLongValue = l10 != null ? l10.longValue() : jElapsedRealtime;
        Float f10 = this.eum.get(Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.gjv.qor.qor(this.f14271hn, new com.bytedance.sdk.openadsdk.jip.hnj.hnj.C0249hnj().hnj(str).hnj(i11).aq(jElapsedRealtime - jLongValue).ojm(f10 == null ? 0.0f : f10.floatValue()).hn(i10).hnj(), this.qor);
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        int i10 = message.what;
        com.bytedance.sdk.openadsdk.jip.hnj.hnj hnjVar = (com.bytedance.sdk.openadsdk.jip.hnj.hnj) message.obj;
        if (i10 == 100) {
            hnjVar.gjv(this.uua ? 2 : 1);
            com.bytedance.sdk.openadsdk.gjv.qor.gjv(this.f14271hn, hnjVar, this.qor);
            this.uua = false;
        } else if (i10 == 200) {
            if (this.f14272oj) {
                hnj(1, hnjVar.qor(), hnjVar.gjv());
            }
            hnjVar.qor(this.f14272oj ? 1 : 0);
            com.bytedance.sdk.openadsdk.gjv.qor.sk(this.f14271hn, hnjVar, this.qor);
            this.dse = false;
            this.f14272oj = false;
        }
    }
}
