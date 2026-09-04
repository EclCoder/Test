package com.bytedance.adsdk.hn;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends ImageView {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final dnm<Throwable> f11910hn = new dnm<Throwable>() { // from class: com.bytedance.adsdk.hn.dkl.1
        @Override // com.bytedance.adsdk.hn.dnm
        public void hnj(Throwable th2) {
            com.bytedance.adsdk.hn.dkl.dkl.hnj(th2);
        }
    };
    private static final String hnj = "dkl";
    private long apu;
    private String aq;
    private int as;
    private boolean bug;
    private int dkl;
    private boolean dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private int f2do;
    private final ojm dse;
    private com.bytedance.adsdk.hn.qor.qor.qor eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private orl<dse> f11911fc;
    private final dnm<Throwable> gjv;
    private hn hqh;
    private dse jip;
    private final Set<Object> mjg;
    private hnj nyv;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private int f11912oj;
    private int ojm;
    private final Set<gjv> orl;
    private final dnm<dse> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private dnm<Throwable> f11913sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private boolean f11914ta;
    private String tgn;
    private int tu;
    private final Handler uua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private final Runnable f11915vf;
    private int wu;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private Handler f11916xn;
    private JSONArray xyo;

    /* JADX INFO: renamed from: com.bytedance.adsdk.hn.dkl$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            hnj = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hnj[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hnj[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum gjv {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class qor extends View.BaseSavedState {
        public static final Parcelable.Creator<qor> CREATOR = new Parcelable.Creator<qor>() { // from class: com.bytedance.adsdk.hn.dkl.qor.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public qor createFromParcel(Parcel parcel) {
                return new qor(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public qor[] newArray(int i10) {
                return new qor[i10];
            }
        };
        int dkl;
        int dse;
        boolean gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        int f11925hn;
        String hnj;
        float qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        String f11926sk;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.hnj);
            parcel.writeFloat(this.qor);
            parcel.writeInt(this.gjv ? 1 : 0);
            parcel.writeString(this.f11926sk);
            parcel.writeInt(this.dkl);
            parcel.writeInt(this.dse);
        }

        qor(Parcelable parcelable) {
            super(parcelable);
        }

        private qor(Parcel parcel) {
            super(parcel);
            this.hnj = parcel.readString();
            this.qor = parcel.readFloat();
            this.gjv = parcel.readInt() == 1;
            this.f11926sk = parcel.readString();
            this.dkl = parcel.readInt();
            this.dse = parcel.readInt();
        }
    }

    public dkl(Context context) {
        super(context);
        this.qor = new dnm<dse>() { // from class: com.bytedance.adsdk.hn.dkl.6
            @Override // com.bytedance.adsdk.hn.dnm
            public void hnj(dse dseVar) {
                dkl.this.setComposition(dseVar);
            }
        };
        this.gjv = new dnm<Throwable>() { // from class: com.bytedance.adsdk.hn.dkl.7
            @Override // com.bytedance.adsdk.hn.dnm
            public void hnj(Throwable th2) {
                if (dkl.this.dkl != 0) {
                    dkl dklVar = dkl.this;
                    dklVar.setImageResource(dklVar.dkl);
                }
                (dkl.this.f11913sk == null ? dkl.f11910hn : dkl.this.f11913sk).hnj(th2);
            }
        };
        this.dkl = 0;
        this.dse = new ojm();
        this.f11914ta = false;
        this.dnm = false;
        this.bug = true;
        this.orl = new HashSet();
        this.mjg = new HashSet();
        this.uua = new Handler(Looper.getMainLooper());
        this.f11912oj = 0;
        this.apu = 0L;
        this.f11915vf = new Runnable() { // from class: com.bytedance.adsdk.hn.dkl.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + dkl.this.wu + ", " + dkl.this.as);
                if (dkl.this.wu > dkl.this.as) {
                    dkl.oj(dkl.this);
                    com.bytedance.adsdk.hn.qor.qor.qor qorVar = dkl.this.eum;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(dkl.this.wu);
                    qorVar.hnj(sb2.toString());
                    dkl.this.invalidate();
                    dkl.this.fc();
                    return;
                }
                if (dkl.this.f2do < 0 || dkl.this.tu < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + dkl.this.f2do + "," + dkl.this.tu);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + dkl.this.f2do);
                    dkl.this.hnj();
                    dkl dklVar = dkl.this;
                    dklVar.setFrame(dklVar.f2do);
                    dkl.this.hnj(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.hn.dkl.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (dkl.this.getFrame() < dkl.this.tu - 1 || dkl.this.getFrame() >= dkl.this.tu + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + dkl.this.tu);
                            dkl.this.hn(this);
                            dkl.this.dkl();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(dkl.this.tgn) || (dkl.this.xyo != null && dkl.this.xyo.length() > 0)) && dkl.this.hqh != null) {
                    hn unused = dkl.this.hqh;
                    String unused2 = dkl.this.tgn;
                    JSONArray unused3 = dkl.this.xyo;
                }
            }
        };
        aq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dse.hnj getGlobalConfig() {
        dse dseVarTgn;
        ojm ojmVar = this.dse;
        if (ojmVar == null || (dseVarTgn = ojmVar.tgn()) == null) {
            return null;
        }
        return dseVarTgn.dnm();
    }

    private dse.hn getGlobalEvent() {
        dse dseVarTgn;
        ojm ojmVar = this.dse;
        if (ojmVar == null || (dseVarTgn = ojmVar.tgn()) == null) {
            return null;
        }
        return dseVarTgn.ta();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        dse dseVarTgn;
        ojm ojmVar = this.dse;
        if (ojmVar == null || (dseVarTgn = ojmVar.tgn()) == null) {
            return null;
        }
        return dseVarTgn.ojm();
    }

    static /* synthetic */ int oj(dkl dklVar) {
        int i10 = dklVar.wu;
        dklVar.wu = i10 - 1;
        return i10;
    }

    private void setCompositionTask(orl<dse> orlVar) {
        this.orl.add(gjv.SET_ANIMATION);
        uua();
        orl();
        this.f11911fc = orlVar.hnj(this.qor).qor(this.gjv);
    }

    static /* synthetic */ int sk(dkl dklVar) {
        int i10 = dklVar.f11912oj;
        dklVar.f11912oj = i10 + 1;
        return i10;
    }

    public boolean getClipToCompositionBounds() {
        return this.dse.qor();
    }

    public dse getComposition() {
        return this.jip;
    }

    public long getDuration() {
        dse dseVar = this.jip;
        if (dseVar != null) {
            return (long) dseVar.sk();
        }
        return 0L;
    }

    public int getFrame() {
        return this.dse.xn();
    }

    public String getImageAssetsFolder() {
        return this.dse.gjv();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.dse.sk();
    }

    public float getMaxFrame() {
        return this.dse.fc();
    }

    public float getMinFrame() {
        return this.dse.mjg();
    }

    public oj getPerformanceTracker() {
        return this.dse.aq();
    }

    public float getProgress() {
        return this.dse.hqh();
    }

    public xn getRenderMode() {
        return this.dse.dkl();
    }

    public int getRepeatCount() {
        return this.dse.eum();
    }

    public int getRepeatMode() {
        return this.dse.apu();
    }

    public float getSpeed() {
        return this.dse.jip();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof ojm) && ((ojm) drawable).dkl() == xn.SOFTWARE) {
            this.dse.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        ojm ojmVar = this.dse;
        if (drawable2 == ojmVar) {
            super.invalidateDrawable(ojmVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.dnm) {
            return;
        }
        this.dse.dnm();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jip();
        Handler handler = this.f11916xn;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        qor();
        hn();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof qor)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qor qorVar = (qor) parcelable;
        super.onRestoreInstanceState(qorVar.getSuperState());
        this.aq = qorVar.hnj;
        Set<gjv> set = this.orl;
        gjv gjvVar = gjv.SET_ANIMATION;
        if (!set.contains(gjvVar) && !TextUtils.isEmpty(this.aq)) {
            setAnimation(this.aq);
        }
        this.ojm = qorVar.f11925hn;
        if (!this.orl.contains(gjvVar) && (i10 = this.ojm) != 0) {
            setAnimation(i10);
        }
        if (!this.orl.contains(gjv.SET_PROGRESS)) {
            hnj(qorVar.qor, false);
        }
        if (!this.orl.contains(gjv.PLAY_OPTION) && qorVar.gjv) {
            hnj();
        }
        if (!this.orl.contains(gjv.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(qorVar.f11926sk);
        }
        if (!this.orl.contains(gjv.SET_REPEAT_MODE)) {
            setRepeatMode(qorVar.dkl);
        }
        if (this.orl.contains(gjv.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(qorVar.dse);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        qor qorVar = new qor(super.onSaveInstanceState());
        qorVar.hnj = this.aq;
        qorVar.f11925hn = this.ojm;
        qorVar.qor = this.dse.hqh();
        qorVar.gjv = this.dse.as();
        qorVar.f11926sk = this.dse.gjv();
        qorVar.dkl = this.dse.apu();
        qorVar.dse = this.dse.eum();
        return qorVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.hn.qor.qor.hnj hnjVarHnj = hnj(motionEvent);
        if (hnjVarHnj == null) {
            if (getGlobalConfig() == null || getGlobalConfig().hnj != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strOjm = hnjVarHnj.ojm();
        if (hnjVarHnj instanceof com.bytedance.adsdk.hn.qor.qor.hn) {
            if (getGlobalConfig() == null || getGlobalConfig().hnj != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strOjm != null && strOjm.startsWith("CSJCLOSE")) {
            jip();
        }
        ta taVarHnj = hnj(hnjVarHnj.sk());
        if (taVarHnj != null && motionEvent.getAction() == 1) {
            hnj(strOjm, taVarHnj.sk(), taVarHnj.dse());
            int[][] iArrDkl = taVarHnj.dkl();
            if (iArrDkl != null) {
                hnj(iArrDkl);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().f11940hn) != null) {
                hnj(iArr);
            }
        }
        if (strOjm == null || !strOjm.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(int i10) {
        this.ojm = i10;
        this.aq = null;
        setCompositionTask(hnj(i10));
    }

    public void setAnimationFromJson(String str) {
        hnj(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.bug ? aq.hnj(getContext(), str) : aq.hnj(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.dse.sk(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.bug = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.dse.hnj(z10);
    }

    public void setComposition(dse dseVar) {
        if (sk.hnj) {
            Log.v(hnj, "Set Composition \n".concat(String.valueOf(dseVar)));
        }
        this.dse.setCallback(this);
        this.jip = dseVar;
        this.f11914ta = true;
        boolean zHnj = this.dse.hnj(dseVar, getContext().getApplicationContext());
        this.f11914ta = false;
        if (getDrawable() != this.dse || zHnj) {
            if (!zHnj) {
                oj();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.mjg.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.dse.dse(str);
    }

    public void setFailureListener(dnm<Throwable> dnmVar) {
        this.f11913sk = dnmVar;
    }

    public void setFallbackResource(int i10) {
        this.dkl = i10;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.hn.qor qorVar) {
        this.dse.hnj(qorVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.dse.hnj(map);
    }

    public void setFrame(int i10) {
        this.dse.qor(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.dse.dse(z10);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.hn.gjv gjvVar) {
        this.dse.hnj(gjvVar);
    }

    public void setImageAssetsFolder(String str) {
        this.dse.hnj(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        orl();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        orl();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        orl();
        super.setImageResource(i10);
    }

    public void setLottieAnimListener(hnj hnjVar) {
        this.nyv = hnjVar;
    }

    public void setLottieClicklistener(hn hnVar) {
        this.hqh = hnVar;
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.dse.hn(z10);
    }

    public void setMaxFrame(int i10) {
        this.dse.hn(i10);
    }

    public void setMaxProgress(float f10) {
        this.dse.hn(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.dse.gjv(str);
    }

    public void setMinFrame(int i10) {
        this.dse.hnj(i10);
    }

    public void setMinProgress(float f10) {
        this.dse.hnj(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.dse.gjv(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.dse.qor(z10);
    }

    public void setProgress(float f10) {
        hnj(f10, true);
    }

    public void setRenderMode(xn xnVar) {
        this.dse.hnj(xnVar);
    }

    public void setRepeatCount(int i10) {
        this.orl.add(gjv.SET_REPEAT_COUNT);
        this.dse.sk(i10);
    }

    public void setRepeatMode(int i10) {
        this.orl.add(gjv.SET_REPEAT_MODE);
        this.dse.gjv(i10);
    }

    public void setSafeMode(boolean z10) {
        this.dse.dkl(z10);
    }

    public void setSpeed(float f10) {
        this.dse.qor(f10);
    }

    public void setTextDelegate(apu apuVar) {
        this.dse.hnj(apuVar);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.dse.aq(z10);
    }

    public void setView(View view) {
        this.dse.hnj(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        ojm ojmVar;
        if (!this.f11914ta && drawable == (ojmVar = this.dse) && ojmVar.wu()) {
            dkl();
        } else if (!this.f11914ta && (drawable instanceof ojm)) {
            ojm ojmVar2 = (ojm) drawable;
            if (ojmVar2.wu()) {
                ojmVar2.vf();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private void aq() {
        setSaveEnabled(false);
        this.bug = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        hnj(0.0f, false);
        hnj(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.dse.hnj(Boolean.valueOf(com.bytedance.adsdk.hn.dkl.dkl.hnj(getContext()) != 0.0f));
        ojm();
        ta();
        bug();
    }

    private void bug() {
        hnj(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.hn.dkl.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                apu apuVarM1do;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - dkl.this.apu;
                dkl.this.hn(this);
                String playDelayedELExpressTimeS = dkl.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (apuVarM1do = dkl.this.dse.m1do()) != null) {
                    try {
                        int i10 = Integer.parseInt(apuVarM1do.hnj(playDelayedELExpressTimeS)) * 1000;
                        if (dkl.this.apu > 0) {
                            long jElapsedRealtime2 = (dkl.this.apu + ((long) i10)) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                dkl.this.dkl();
                                dkl.this.setVisibility(8);
                                if (dkl.this.f11916xn == null) {
                                    dkl.this.f11916xn = new Handler(Looper.getMainLooper());
                                }
                                dkl.this.f11916xn.removeCallbacksAndMessages(null);
                                dkl.this.f11916xn.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.hn.dkl.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        dkl.this.setVisibility(0);
                                        dkl.this.hnj();
                                        dkl.this.hnj(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                dkl.this.hnj(jElapsedRealtime);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dnm() {
        final dse.hnj globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.f11942sk <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.dkl) && globalConfig.dse == null) {
            return;
        }
        int maxFrame = globalConfig.f11942sk;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        hnj(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.hn.dkl.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                dkl.this.hn(this);
                if (dkl.this.hqh != null) {
                    hn unused = dkl.this.hqh;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fc() {
        this.uua.postDelayed(this.f11915vf, 1000L);
    }

    private void gjv(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 >= f10 || f13 >= f11) {
            if (f12 / f13 >= f10 / f11) {
                float f14 = f10 / f12;
                matrix.preScale(f14, f14);
                matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
                return;
            } else {
                float f15 = f11 / f13;
                matrix.preScale(f15, f15);
                matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f12 / f13 >= f10 / f11) {
            float f16 = f10 / f12;
            matrix.preScale(f16, f16);
            matrix.postTranslate(0.0f, (f11 - (f13 * f16)) / 2.0f);
        } else {
            float f17 = f11 / f13;
            matrix.preScale(f17, f17);
            matrix.postTranslate((f10 - (f12 * f17)) / 2.0f, 0.0f);
        }
    }

    private void hn(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.dse.getBounds().width();
        float fHeight = this.dse.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.hnj[getScaleType().ordinal()];
        if (i10 == 1) {
            hnj(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            hn(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            qor(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            gjv(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void jip() {
        this.uua.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mjg() {
        ojm ojmVar;
        int i10;
        int i11;
        final int i12;
        if (this.jip == null || (ojmVar = this.dse) == null) {
            return;
        }
        apu apuVarM1do = ojmVar.m1do();
        dse.qor qorVarAq = this.jip.aq();
        if (qorVarAq == null || apuVarM1do == null) {
            return;
        }
        final int i13 = qorVarAq.hnj;
        if (i13 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i13)));
            return;
        }
        int[] iArr = qorVarAq.f11944sk;
        final int i14 = -1;
        if (iArr == null || iArr.length < 2) {
            i10 = -1;
            i11 = -1;
        } else {
            i11 = iArr[0];
            i10 = iArr[1];
        }
        String strHnj = apuVarM1do.hnj(qorVarAq.qor);
        String strHnj2 = apuVarM1do.hnj(qorVarAq.gjv);
        try {
            i12 = Integer.parseInt(strHnj);
            try {
                i14 = Integer.parseInt(strHnj2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i12 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i12 + ", lenS: " + i14);
        if (TextUtils.isEmpty(qorVarAq.f11943hn)) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + qorVarAq.f11943hn);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + qorVarAq.f11943hn);
        com.bytedance.adsdk.hn.qor.qor.qor qorVarQor = qor(qorVarAq.f11943hn);
        if (qorVarQor != null) {
            Log.i("TMe", "--==--- timer success");
            this.tgn = qorVarAq.dkl;
            this.xyo = qorVarAq.dse;
            this.eum = qorVarQor;
            this.wu = i12;
            this.as = i12 - i14;
            this.f2do = i11;
            this.tu = i10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.wu);
            qorVarQor.hnj(sb2.toString());
            hnj(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.hn.dkl.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (dkl.this.getFrame() < i13 - 1 || dkl.this.getFrame() >= i13 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + dkl.this.getFrame());
                    dkl.this.hn(this);
                    if (i12 < 0 || i14 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        dkl.this.fc();
                    }
                    dkl.this.dkl();
                }
            });
        }
    }

    private void oj() {
        boolean zGjv = gjv();
        setImageDrawable(null);
        setImageDrawable(this.dse);
        if (zGjv) {
            this.dse.orl();
        }
    }

    private void ojm() {
        hnj(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.hn.dkl.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                dkl.this.hn(this);
                dkl.this.mjg();
                dkl.this.dnm();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    private void orl() {
        orl<dse> orlVar = this.f11911fc;
        if (orlVar != null) {
            orlVar.hn(this.qor);
            this.f11911fc.gjv(this.gjv);
        }
    }

    private void qor(Matrix matrix, float f10, float f11, float f12, float f13) {
        matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
    }

    private void ta() {
        hnj(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.hn.dkl.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                dkl.sk(dkl.this);
                dse.hnj globalConfig = dkl.this.getGlobalConfig();
                if (globalConfig != null && (i10 = globalConfig.gjv) > 0 && i10 > dkl.this.f11912oj) {
                    dkl.this.mjg();
                    dkl.this.hnj();
                    dkl.this.setProgress(0.0f);
                } else {
                    dkl.this.hn(this);
                    if (dkl.this.nyv != null) {
                        hnj unused = dkl.this.nyv;
                    }
                }
            }
        });
    }

    private void uua() {
        this.jip = null;
        this.dse.ta();
    }

    public void dkl() {
        this.dnm = false;
        this.dse.vf();
    }

    public void setMaxFrame(String str) {
        this.dse.qor(str);
    }

    public void setMinFrame(String str) {
        this.dse.hn(str);
    }

    public void sk() {
        this.orl.add(gjv.PLAY_OPTION);
        this.dse.xyo();
    }

    private com.bytedance.adsdk.hn.qor.qor.qor qor(String str) {
        com.bytedance.adsdk.hn.qor.qor.hn hnVarHn;
        ojm ojmVar = this.dse;
        if (ojmVar == null || (hnVarHn = ojmVar.hn()) == null) {
            return null;
        }
        return hnj(hnVarHn, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(long j10) {
        Map<String, Object> map;
        dse.hnj globalConfig = getGlobalConfig();
        if (this.nyv != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j10));
            if (globalConfig == null || (map = globalConfig.f11941hn) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.f11941hn);
        }
    }

    public void setAnimation(String str) {
        this.aq = str;
        this.ojm = 0;
        setCompositionTask(hn(str));
    }

    public void qor() {
        this.dse.oj();
    }

    private ta hnj(String str) {
        ojm ojmVar;
        dse dseVarTgn;
        Map<String, ta> mapJip;
        if (TextUtils.isEmpty(str) || (ojmVar = this.dse) == null || (dseVarTgn = ojmVar.tgn()) == null || (mapJip = dseVarTgn.jip()) == null) {
            return null;
        }
        return mapJip.get(str);
    }

    public boolean gjv() {
        return this.dse.wu();
    }

    private void hn(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 < f10 && f13 < f11) {
            matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
            return;
        }
        if (f12 / f13 >= f10 / f11) {
            float f14 = f10 / f12;
            matrix.preScale(f14, f14);
            matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
        } else {
            float f15 = f11 / f13;
            matrix.preScale(f15, f15);
            matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
        }
    }

    private void hnj(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i10 = iArr2[0];
            final int i11 = iArr2[1];
            if (i10 < 0 || i11 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i10)));
            jip();
            hnj();
            setFrame(i10);
            hnj(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.hn.dkl.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (dkl.this.getFrame() < i11 - 1 || dkl.this.getFrame() >= i11 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i11 + ", realFrame: " + dkl.this.getFrame());
                    dkl.this.hn(this);
                    dkl.this.dkl();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private orl<dse> hn(final String str) {
        if (isInEditMode()) {
            return new orl<>(new Callable<bug<dse>>() { // from class: com.bytedance.adsdk.hn.dkl.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
                public bug<dse> call() {
                    return dkl.this.bug ? aq.qor(dkl.this.getContext(), str) : aq.qor(dkl.this.getContext(), str, null);
                }
            }, true);
        }
        return this.bug ? aq.hn(getContext(), str) : aq.hn(getContext(), str, (String) null);
    }

    public void hn(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.dse.hn(animatorUpdateListener);
    }

    private void hnj(String str, String str2, JSONArray jSONArray) {
        dse.hn globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.hnj;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.qor;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    public void hn() {
        this.dse.uua();
    }

    public void hn(Animator.AnimatorListener animatorListener) {
        this.dse.hn(animatorListener);
    }

    private com.bytedance.adsdk.hn.qor.qor.hnj hnj(MotionEvent motionEvent) {
        com.bytedance.adsdk.hn.qor.qor.hn hnVarHn;
        ojm ojmVar = this.dse;
        if (ojmVar == null || (hnVarHn = ojmVar.hn()) == null) {
            return null;
        }
        return hnj(hnVarHn, motionEvent);
    }

    private com.bytedance.adsdk.hn.qor.qor.hnj hnj(com.bytedance.adsdk.hn.qor.qor.hn hnVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.hn.qor.qor.hnj hnjVarHnj;
        for (com.bytedance.adsdk.hn.qor.qor.hnj hnjVar : hnVar.bug()) {
            if (hnjVar instanceof com.bytedance.adsdk.hn.qor.qor.hn) {
                if (hnjVar.aq() && hnjVar.dkl() > 0.0f) {
                    RectF rectF = new RectF();
                    hnjVar.hnj(rectF, hnjVar.gjv(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (hnjVarHnj = hnj((com.bytedance.adsdk.hn.qor.qor.hn) hnjVar, motionEvent)) != null) {
                        return hnjVarHnj;
                    }
                }
            } else if (hnjVar.aq() && hnjVar.dkl() > 0.0f) {
                RectF rectF2 = new RectF();
                ojm ojmVar = this.dse;
                if (ojmVar != null && ojmVar.dse()) {
                    hnjVar.hnj(rectF2, hnjVar.gjv(), true);
                    RectF rectFNyv = this.dse.nyv();
                    if (rectFNyv != null) {
                        hnj(rectF2, rectFNyv);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    hnjVar.hnj(rectF3, hnjVar.gjv(), true);
                    hn(rectF2, rectF3);
                }
                if (hnj(motionEvent, rectF2)) {
                    return hnjVar;
                }
            }
        }
        return null;
    }

    private boolean hnj(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (x10 >= rectF.left && x10 <= rectF.right && y10 >= rectF.top && y10 <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void hnj(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i10 = AnonymousClass5.hnj[getScaleType().ordinal()];
        if (i10 == 1) {
            hnj(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 2) {
            hn(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 3) {
            qor(matrix, width, height, fWidth, fHeight);
        } else if (i10 == 4) {
            gjv(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void hnj(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 / f13 >= f10 / f11) {
            float f14 = f11 / f13;
            matrix.preScale(f14, f14);
            matrix.postTranslate(-(((f12 * f14) - f10) / 2.0f), 0.0f);
        } else {
            float f15 = f10 / f12;
            matrix.preScale(f15, f15);
            matrix.postTranslate(0.0f, -(((f13 * f15) - f11) / 2.0f));
        }
    }

    public void hnj(boolean z10, Context context) {
        this.dse.hnj(z10, context);
    }

    private orl<dse> hnj(final int i10) {
        if (isInEditMode()) {
            return new orl<>(new Callable<bug<dse>>() { // from class: com.bytedance.adsdk.hn.dkl.13
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
                public bug<dse> call() {
                    return dkl.this.bug ? aq.hn(dkl.this.getContext(), i10) : aq.hn(dkl.this.getContext(), i10, (String) null);
                }
            }, true);
        }
        return this.bug ? aq.hnj(getContext(), i10) : aq.hnj(getContext(), i10, (String) null);
    }

    public void hnj(String str, String str2) {
        hnj(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void hnj(InputStream inputStream, String str) {
        setCompositionTask(aq.hnj(inputStream, str));
    }

    private com.bytedance.adsdk.hn.qor.qor.qor hnj(com.bytedance.adsdk.hn.qor.qor.hn hnVar, String str) {
        for (com.bytedance.adsdk.hn.qor.qor.hnj hnjVar : hnVar.bug()) {
            if (hnjVar instanceof com.bytedance.adsdk.hn.qor.qor.hn) {
                com.bytedance.adsdk.hn.qor.qor.qor qorVarHnj = hnj((com.bytedance.adsdk.hn.qor.qor.hn) hnjVar, str);
                if (qorVarHnj != null) {
                    return qorVarHnj;
                }
            } else if (TextUtils.equals(str, hnjVar.ojm()) && (hnjVar instanceof com.bytedance.adsdk.hn.qor.qor.qor)) {
                return (com.bytedance.adsdk.hn.qor.qor.qor) hnjVar;
            }
        }
        return null;
    }

    public void hnj() {
        if (this.apu == 0) {
            this.apu = SystemClock.elapsedRealtime();
        }
        this.orl.add(gjv.PLAY_OPTION);
        this.dse.dnm();
    }

    public void hnj(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.dse.hnj(animatorUpdateListener);
    }

    public void hnj(Animator.AnimatorListener animatorListener) {
        this.dse.hnj(animatorListener);
    }

    public void hnj(boolean z10) {
        this.dse.sk(z10 ? -1 : 0);
    }

    public Bitmap hnj(String str, Bitmap bitmap) {
        return this.dse.hnj(str, bitmap);
    }

    private void hnj(float f10, boolean z10) {
        if (z10) {
            this.orl.add(gjv.SET_PROGRESS);
        }
        this.dse.gjv(f10);
    }
}
