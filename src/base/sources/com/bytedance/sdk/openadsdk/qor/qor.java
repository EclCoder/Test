package com.bytedance.sdk.openadsdk.qor;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.nyv;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor implements nyv {
    private boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Context f14595hn;
    public bug hnj;
    private gjv qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private nyv.hnj f14596sk;

    public qor(Context context, String str, List<FilterWord> list, as asVar) {
        this.f14595hn = context;
        hnj(str, list, asVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gjv() {
        Context context = this.f14595hn;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.hnj.isShowing()) {
            return;
        }
        this.hnj.show();
    }

    private void hnj(String str, List<FilterWord> list, as asVar) {
        this.qor = new gjv(this.f14595hn, str, list);
        bug bugVar = new bug(this.f14595hn, this.qor.getDislikeManager());
        this.hnj = bugVar;
        bugVar.hnj(asVar);
        this.hnj.hnj(new bug.hnj() { // from class: com.bytedance.sdk.openadsdk.qor.qor.1
            @Override // com.bytedance.sdk.openadsdk.qor.bug.hnj
            public void hn() {
                qor.this.hnj();
            }

            @Override // com.bytedance.sdk.openadsdk.qor.bug.hnj
            public void hnj() {
            }

            @Override // com.bytedance.sdk.openadsdk.qor.bug.hnj
            public void qor() {
                qor.this.hnj();
            }

            @Override // com.bytedance.sdk.openadsdk.qor.bug.hnj
            public void hnj(int i10, FilterWord filterWord, String str2) {
                qor.this.qor.onSuggestionSubmit(str2);
                qor.this.hnj();
            }
        });
        this.qor.hnj(new gjv.hnj() { // from class: com.bytedance.sdk.openadsdk.qor.qor.2
            @Override // com.bytedance.sdk.openadsdk.qor.gjv.hnj
            public void hn() {
                try {
                    if (qor.this.f14596sk != null) {
                        qor.this.f14596sk.hnj();
                    }
                } catch (Throwable th2) {
                    apu.hnj("TTAdDislikeImpl", "dislike callback cancel error: ", th2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.qor.gjv.hnj
            public void hnj() {
                qor.this.hnj(true);
                if (qor.this.qor != null && qor.this.qor.isShowing()) {
                    qor.this.qor.hide();
                }
                qor.this.gjv();
            }

            @Override // com.bytedance.sdk.openadsdk.qor.gjv.hnj
            public void hnj(int i10, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && qor.this.f14596sk != null) {
                        qor.this.f14596sk.hnj(i10, filterWord.getName());
                    }
                    filterWord.getName();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.nyv
    public void hn() {
        gjv gjvVar = this.qor;
        if (gjvVar != null) {
            gjvVar.destroy();
        }
    }

    public boolean qor() {
        return this.gjv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nyv
    public void hnj() {
        Context context = this.f14595hn;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.qor.isShowing()) {
            return;
        }
        this.qor.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nyv
    public void hnj(nyv.hnj hnjVar) {
        this.f14596sk = hnjVar;
    }

    public void hnj(boolean z10) {
        this.gjv = z10;
    }
}
