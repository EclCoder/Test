package com.bytedance.sdk.component.ojm;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.hqh;
import com.bytedance.sdk.component.utils.ojm;
import com.bytedance.sdk.component.utils.xyo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends qor implements xyo.hnj {
    private View.OnTouchListener apu;
    private volatile float aq;
    private long bug;
    private final Context dkl;
    private long dnm;
    private volatile float dse;
    private final List<Integer> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int f12931hn;
    private boolean jip;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private float f12932oj;
    private int orl;
    private final int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final int f12933sk;
    private float uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private String f12935xn;
    private float ojm = -1.0f;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private float f12934ta = -1.0f;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final Handler f12930fc = new xyo(ojm.hnj().getLooper(), this);
    InterfaceC0193hnj hnj = new InterfaceC0193hnj() { // from class: com.bytedance.sdk.component.ojm.hnj.1
        @Override // com.bytedance.sdk.component.ojm.hnj.InterfaceC0193hnj
        public void hnj() {
            if (hnj.this.ojm == -1.0f && hnj.this.f12934ta == -1.0f && hnj.this.bug == -1) {
                float unused = hnj.this.ojm;
                float unused2 = hnj.this.f12934ta;
                hnj hnjVar = hnj.this;
                hnjVar.ojm = hnjVar.dse;
                hnj hnjVar2 = hnj.this;
                hnjVar2.f12934ta = hnjVar2.aq;
                hnj hnjVar3 = hnj.this;
                hnjVar3.bug = hnjVar3.dnm;
                hnj.this.jip = true;
            }
            float unused3 = hnj.this.ojm;
            float unused4 = hnj.this.f12934ta;
        }

        @Override // com.bytedance.sdk.component.ojm.hnj.InterfaceC0193hnj
        public void hnj(int i10) {
            hnj.this.orl = i10;
            hnj.this.hn();
        }
    };
    private int eum = -1;
    private final List<Integer> mjg = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ojm.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0193hnj {
        void hnj();

        void hnj(int i10);
    }

    public hnj(Context context, int i10, int i11, List<Integer> list, int i12) {
        this.dkl = context;
        if (i10 == -1) {
            this.f12931hn = hqh.hnj(context);
        } else {
            this.f12931hn = hqh.hnj(context, i10);
        }
        this.qor = hqh.hnj(context, i11);
        this.gjv = list;
        this.f12933sk = i12;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        hnj hnjVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.dnm = SystemClock.elapsedRealtime();
        this.dse = x10;
        this.aq = y10;
        if (action == 0) {
            hnjVar = this;
            hnjVar.uua = x10;
            hnjVar.f12932oj = y10;
        } else if (action != 1) {
            hnjVar = this;
        } else {
            hnjVar = this;
            if (hnjVar.hnj(x10, y10, this.uua, this.f12932oj, this.dkl)) {
                int iHnj = hnj(hnjVar.dse, hnjVar.aq, hnjVar.dnm);
                boolean zContains = hnjVar.mjg.contains(Integer.valueOf(hnjVar.orl));
                hnj(view, motionEvent, iHnj, !zContains);
                if (!zContains) {
                    hnjVar.mjg.add(Integer.valueOf(hnjVar.orl));
                }
                if (iHnj == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = hnjVar.apu;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hn() {
        this.ojm = -1.0f;
        this.f12934ta = -1.0f;
        this.bug = -1L;
    }

    @Override // com.bytedance.sdk.component.ojm.qor
    public void hnj(View.OnTouchListener onTouchListener) {
        this.apu = onTouchListener;
    }

    public InterfaceC0193hnj hnj() {
        return this.hnj;
    }

    private void hnj(View view, MotionEvent motionEvent, int i10, boolean z10) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i10 == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z10 ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i10);
        jSONObject.put("current_url_index", this.orl);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.f12930fc.sendMessageDelayed(messageObtain, 200L);
    }

    public void hnj(String str) {
        this.f12935xn = str;
    }

    private int hnj(float f10, float f11, long j10) {
        if (this.ojm == -1.0f && this.f12934ta == -1.0f && this.bug == -1) {
            return 1;
        }
        if (!this.gjv.contains(Integer.valueOf(this.orl))) {
            return 2;
        }
        if (j10 - this.bug > this.f12933sk) {
            hn();
            return 3;
        }
        float fAbs = Math.abs(f10 - this.ojm);
        float fAbs2 = Math.abs(f11 - this.f12934ta);
        if (fAbs <= this.f12931hn / 2.0f && fAbs2 <= this.qor / 2.0f) {
            return 0;
        }
        hn();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        int i10 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i10 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.jip ? 1 : 0);
                    this.jip = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.ojm.hnj.hnj.hnj().hn() != null) {
                com.bytedance.sdk.component.ojm.hnj.hnj.hnj().hn().hnj(this.f12935xn, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
