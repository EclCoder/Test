package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f20425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f20426d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private jc.d f20429g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f20423a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jc.f f20424b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20427e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f20428f = new WeakReference(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends jc.f {
        a() {
        }

        @Override // jc.f
        public void a(int i10) {
            w.this.f20427e = true;
            b bVar = (b) w.this.f20428f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // jc.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            w.this.f20427e = true;
            b bVar = (b) w.this.f20428f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public w(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f20423a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f20423a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f20425c = d(str);
        this.f20426d = c(str);
        this.f20427e = false;
    }

    public jc.d e() {
        return this.f20429g;
    }

    public float f(String str) {
        if (!this.f20427e) {
            return this.f20426d;
        }
        i(str);
        return this.f20426d;
    }

    public TextPaint g() {
        return this.f20423a;
    }

    public float h(String str) {
        if (!this.f20427e) {
            return this.f20425c;
        }
        i(str);
        return this.f20425c;
    }

    public void j(b bVar) {
        this.f20428f = new WeakReference(bVar);
    }

    public void k(jc.d dVar, Context context) {
        if (this.f20429g != dVar) {
            this.f20429g = dVar;
            if (dVar != null) {
                dVar.s(context, this.f20423a, this.f20424b);
                b bVar = (b) this.f20428f.get();
                if (bVar != null) {
                    this.f20423a.drawableState = bVar.getState();
                }
                dVar.r(context, this.f20423a, this.f20424b);
                this.f20427e = true;
            }
            b bVar2 = (b) this.f20428f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f20427e = z10;
    }

    public void m(boolean z10) {
        this.f20427e = z10;
    }

    public void n(Context context) {
        this.f20429g.r(context, this.f20423a, this.f20424b);
    }
}
