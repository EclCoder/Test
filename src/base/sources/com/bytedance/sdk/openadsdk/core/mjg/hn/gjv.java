package com.bytedance.sdk.openadsdk.core.mjg.hn;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.widget.apu;
import com.bytedance.sdk.openadsdk.core.widget.xn;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.jip;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p6.b;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends sk {
    private float aip;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    private ImageView f13799cm;

    /* JADX INFO: renamed from: dl, reason: collision with root package name */
    private final Rect f13800dl;
    private int dy;
    private View dzo;
    private TextView eta;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private TextView f13801ff;
    private int fr;
    private TextView fvt;
    private final int fzb;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    private int f13802gn;
    private ColorStateList hkr;
    private final Rect idl;
    private boolean izk;
    private TextView jbd;
    private ColorStateList jle;

    /* JADX INFO: renamed from: jo, reason: collision with root package name */
    private int f13803jo;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    private final xyo f13804ka;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final Rect f13805ko;
    private ColorStateList krm;
    private int lhi;
    private final View.OnTouchListener lko;
    private SeekBar lu;
    private float meb;
    private boolean mkl;
    private ImageView orp;
    private ImageView pnz;
    private TextView pv;

    /* JADX INFO: renamed from: qb, reason: collision with root package name */
    private int f13806qb;

    /* JADX INFO: renamed from: rd, reason: collision with root package name */
    private float f13807rd;
    private TextView rmr;
    private final xn rq;
    private View sq;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final Rect f13808th;
    private float tll;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private float f13809vh;
    private TextView xad;

    /* JADX INFO: renamed from: xo, reason: collision with root package name */
    private View f13810xo;
    private final Rect xw;
    private final int znr;
    private ImageView zt;

    public gjv(Context context, ViewGroup viewGroup, boolean z10, int i10, as asVar, c cVar, boolean z11) {
        super(context, viewGroup, z10, i10, asVar, cVar, z11);
        this.f13804ka = new xyo(this);
        this.izk = false;
        this.mkl = false;
        this.lhi = 0;
        this.f13806qb = 0;
        this.fr = 0;
        this.f13802gn = 0;
        this.dy = 0;
        this.idl = new Rect();
        this.f13808th = new Rect();
        this.f13803jo = 0;
        this.lko = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.gjv.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.f13800dl = new Rect();
        this.xw = new Rect();
        this.f13805ko = new Rect();
        this.tgn = oj.hnj().getApplicationContext();
        gjv(z11);
        this.qor = viewGroup;
        this.eum = z10;
        xn xnVar = new xn(this);
        this.rq = xnVar;
        xnVar.hnj(this.eum);
        DisplayMetrics displayMetrics = this.tgn.getResources().getDisplayMetrics();
        this.fzb = displayMetrics.widthPixels;
        this.znr = displayMetrics.heightPixels;
        this.f38do = i10;
        this.pty = cVar;
        this.tu = asVar;
        gjv(8);
        hnj(context, this.qor);
        gjv();
        bug();
    }

    private void tgn() {
        TextView textView = this.eta;
        if (textView != null) {
            textView.setTextSize(0, this.meb);
            ColorStateList colorStateList = this.krm;
            if (colorStateList != null) {
                this.eta.setTextColor(colorStateList);
            }
            this.eta.setAlpha(this.f13809vh);
            this.eta.setShadowLayer(sq.hn(this.tgn, 1.0f), 0.0f, 0.0f, wu.dse(this.tgn, "tt_72000000"));
            TextView textView2 = this.eta;
            Rect rect = this.f13800dl;
            sq.hnj(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.rmr;
        if (textView3 != null) {
            textView3.setTextSize(0, this.aip);
            ColorStateList colorStateList2 = this.jle;
            if (colorStateList2 != null) {
                this.rmr.setTextColor(colorStateList2);
            }
            this.rmr.setAlpha(this.f13807rd);
            this.rmr.setShadowLayer(sq.hn(this.tgn, 1.0f), 0.0f, 0.0f, wu.dse(this.tgn, "tt_72000000"));
            TextView textView4 = this.rmr;
            Rect rect2 = this.xw;
            sq.hnj(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.zt;
        if (imageView != null) {
            Rect rect3 = this.f13805ko;
            sq.hnj(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.zt;
        if (imageView2 != null) {
            imageView2.setImageDrawable(wu.qor(this.tgn, "tt_enlarge_video"));
        }
        TextView textView5 = this.f13801ff;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.hkr;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.f13801ff.setAlpha(this.tll);
            TextView textView6 = this.f13801ff;
            Rect rect4 = this.xw;
            sq.hnj(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.sq;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f13803jo;
            this.sq.setLayoutParams(layoutParams);
            this.sq.setBackground(dnm.hnj(this.tgn, "tt_video_black_desc_gradient"));
        }
        hn(false, true);
    }

    private void tu() {
        DisplayMetrics displayMetrics = this.tgn.getResources().getDisplayMetrics();
        TextView textView = this.eta;
        if (textView != null) {
            this.meb = textView.getTextSize();
            this.eta.setTextSize(2, 14.0f);
            ColorStateList textColors = this.eta.getTextColors();
            this.krm = textColors;
            if (textColors != null) {
                this.eta.setTextColor(-1);
            }
            this.f13809vh = this.eta.getAlpha();
            this.eta.setAlpha(0.85f);
            this.eta.setShadowLayer(0.0f, sq.hn(this.tgn, 0.5f), sq.hn(this.tgn, 0.5f), wu.dse(this.tgn, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.eta.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f13800dl.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                sq.hnj(this.eta, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f13800dl.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.f13800dl.bottom);
            }
        }
        TextView textView2 = this.rmr;
        if (textView2 != null) {
            this.aip = textView2.getTextSize();
            this.rmr.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.rmr.getTextColors();
            this.jle = textColors2;
            if (textColors2 != null) {
                this.rmr.setTextColor(-1);
            }
            this.f13807rd = this.rmr.getAlpha();
            this.rmr.setAlpha(0.85f);
            this.rmr.setShadowLayer(0.0f, sq.hn(this.tgn, 0.5f), sq.hn(this.tgn, 0.5f), wu.dse(this.tgn, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.rmr.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.xw.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.rmr;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.xw;
                sq.hnj(textView3, iApplyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.zt;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.f13805ko.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.zt;
                Rect rect2 = this.f13805ko;
                sq.hnj(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f13805ko.bottom);
            }
        }
        ImageView imageView3 = this.zt;
        if (imageView3 != null) {
            imageView3.setImageDrawable(wu.qor(this.tgn, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.f13801ff;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.hkr = textColors3;
            if (textColors3 != null) {
                this.f13801ff.setTextColor(-1);
            }
            this.tll = this.f13801ff.getAlpha();
            this.f13801ff.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.f13801ff.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.f13808th.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.f13801ff;
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.xw;
                sq.hnj(textView5, iApplyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.sq;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.f13803jo = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.sq.setLayoutParams(layoutParams5);
            this.sq.setBackgroundResource(wu.gjv(this.tgn, "tt_shadow_fullscreen_top"));
        }
        hn(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void aq() {
        sq.sk(this.dkl);
        sq.sk(this.dzo);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void dkl() {
        this.f13804ka.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk, com.bytedance.sdk.openadsdk.core.widget.apu.hn
    public void dnm() {
        hnj(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void dse() {
        as asVar;
        sq.dkl(this.dkl);
        sq.dkl(this.dse);
        sq.sk(this.dzo);
        if (this.aq != null && (asVar = this.tu) != null && asVar.pwt() != null && this.tu.pwt().J() != null) {
            sq.dkl(this.aq);
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.tu.pwt().J(), this.tu.pwt().D(), this.tu.pwt().p(), this.aq, this.tu);
        }
        if (this.f13825sk.getVisibility() == 0) {
            sq.hnj((View) this.f13825sk, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    protected void gjv() {
        super.gjv();
        this.rq.hnj(this.qor);
        sq.hnj((View) this.orp, (this.eum || (this.f38do & 1) == 1) ? 8 : 0);
        this.orp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.gjv.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (gjv.this.jip()) {
                    gjv gjvVar = gjv.this;
                    gjvVar.f13829vf.qor(gjvVar, view);
                }
            }
        });
        sq.hnj((View) this.fvt, (!this.eum || (this.f38do & 2) == 2) ? 0 : 8);
        this.fvt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.gjv.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (gjv.this.jip()) {
                    gjv gjvVar = gjv.this;
                    gjvVar.f13829vf.gjv(gjvVar, view);
                }
            }
        });
        this.f13799cm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.gjv.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (gjv.this.jip()) {
                    gjv gjvVar = gjv.this;
                    gjvVar.f13829vf.sk(gjvVar, view);
                }
            }
        });
        this.pnz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.gjv.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                gjv.this.hn(false, true);
                gjv.this.aq();
                gjv.this.dse();
                gjv.this.jip();
            }
        });
        this.zt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.gjv.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (gjv.this.jip()) {
                    gjv gjvVar = gjv.this;
                    gjvVar.f13829vf.hn(gjvVar, view);
                }
            }
        });
        this.lu.setThumbOffset(0);
        this.lu.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hn.gjv.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
                if (gjv.this.jip()) {
                    gjv gjvVar = gjv.this;
                    gjvVar.f13829vf.hnj(gjvVar, i10, z10);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!gjv.this.izk && gjv.this.tgn != null) {
                    seekBar.setThumb(dnm.hnj(oj.hnj(), "tt_seek_thumb_press"));
                }
                if (gjv.this.jip()) {
                    seekBar.setThumbOffset(0);
                    gjv gjvVar = gjv.this;
                    gjvVar.f13829vf.hn(gjvVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!gjv.this.izk && gjv.this.tgn != null) {
                    seekBar.setThumb(dnm.hnj(oj.hnj(), "tt_seek_thumb_normal"));
                }
                if (gjv.this.jip()) {
                    seekBar.setThumbOffset(0);
                    gjv gjvVar = gjv.this;
                    gjvVar.f13829vf.hnj(gjvVar, seekBar.getProgress());
                }
            }
        });
        this.lu.setOnTouchListener(this.lko);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void hn(boolean z10) {
        int i10 = ta() ? this.znr : this.uua;
        int iHn = ta() ? this.fzb : this.f13824oj;
        if (this.apu <= 0 || this.f13830xn <= 0 || i10 <= 0) {
            return;
        }
        if (!eum() && !ta() && (this.f38do & 8) != 8) {
            iHn = sq.hn(this.tgn, 228.0f);
        }
        int i11 = this.f13830xn;
        int i12 = this.apu;
        int i13 = (int) (i12 * ((i10 * 1.0f) / i11));
        if (i13 > iHn) {
            i10 = (int) (i11 * ((iHn * 1.0f) / i12));
        } else {
            iHn = i13;
        }
        if (!z10 && !ta()) {
            i10 = this.uua;
            iHn = this.f13824oj;
        }
        this.gjv.hnj(i10, iHn);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk, x6.a
    public /* bridge */ /* synthetic */ void hnj(Object obj, WeakReference weakReference, boolean z10) {
        hnj((as) obj, (WeakReference<Context>) weakReference, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void ojm() {
        this.lu.setProgress(0);
        this.lu.setSecondaryProgress(0);
        this.rmr.setText(wu.hnj(this.tgn, "tt_00_00"));
        this.eta.setText(wu.hnj(this.tgn, "tt_00_00"));
        gjv(8);
        if (m28do()) {
            this.gjv.setVisibility(8);
        }
        ImageView imageView = this.aq;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        gjv(8);
        sq.hnj(this.f13810xo, 8);
        sq.hnj(this.f13826ta, 8);
        sq.hnj((View) this.dnm, 8);
        sq.hnj(this.bug, 8);
        sq.hnj((View) this.orl, 8);
        sq.hnj((View) this.mjg, 8);
        sq.hnj((View) this.f13821fc, 8);
        apu apuVar = this.xyo;
        if (apuVar != null) {
            apuVar.hnj(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void qor(boolean z10) {
        TextView textView = this.jbd;
        if (textView != null) {
            sq.hnj((View) textView, (!this.eum && z10) ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void sk() {
        this.f13804ka.removeMessages(1);
        this.f13804ka.sendMessageDelayed(this.f13804ka.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk, com.bytedance.sdk.openadsdk.core.widget.apu.hn
    public boolean ta() {
        return this.izk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    protected void hnj(Context context, View view) {
        super.hnj(context, view);
        this.fvt = (TextView) view.findViewById(jip.ldn);
        this.orp = (ImageView) view.findViewById(jip.f14680sl);
        this.sq = view.findViewById(jip.f14683tb);
        this.f13799cm = (ImageView) view.findViewById(jip.kby);
        this.jbd = (TextView) view.findViewById(jip.f14691xd);
        this.f13801ff = (TextView) view.findViewById(jip.br);
        this.xad = (TextView) view.findViewById(jip.bqc);
        this.dzo = view.findViewById(jip.f14692xe);
        this.pnz = (ImageView) view.findViewById(jip.lx);
        TextView textView = (TextView) view.findViewById(jip.f14678sh);
        this.pv = textView;
        textView.setText(wu.hnj(context, "tt_video_retry_des_txt"));
        this.lu = (SeekBar) view.findViewById(jip.cvc);
        this.rmr = (TextView) view.findViewById(jip.zyh);
        this.eta = (TextView) view.findViewById(jip.ett);
        this.f13810xo = view.findViewById(jip.f14681sp);
        this.zt = (ImageView) view.findViewById(jip.pdc);
        this.ojm = view.findViewById(jip.f14677sg);
    }

    private void sk(boolean z10) {
        if (z10) {
            tu();
        } else {
            tgn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void hn(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = this.qor) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.izk = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.qor.getLayoutParams();
        marginLayoutParams.width = this.fr;
        marginLayoutParams.height = this.f13802gn;
        marginLayoutParams.leftMargin = this.f13806qb;
        marginLayoutParams.topMargin = this.lhi;
        this.qor.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.dy);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.idl;
            sq.hnj(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        hn(true);
        this.zt.setImageDrawable(wu.qor(this.tgn, "tt_enlarge_video"));
        this.lu.setThumb(dnm.hnj(this.tgn, "tt_seek_thumb_normal"));
        this.lu.setThumbOffset(0);
        b.c(this.qor, true);
        sk(this.izk);
        sq.hnj(this.sq, 8);
        if ((this.f38do & 2) == 2) {
            sq.hnj((View) this.fvt, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void hnj(String str) {
        TextView textView = this.jbd;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f13801ff;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void hnj(int i10) {
        View view = this.f13810xo;
        if (view == null || view.getVisibility() != 0) {
            this.lu.setProgress(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void hnj(long j10, long j11) {
        this.rmr.setText(b.b(j11));
        this.eta.setText(b.b(j10));
        this.lu.setProgress(b.a(j10, j11));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk, x6.a
    public void hnj() {
        hnj(false, this.eum);
        xn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void hnj(long j10) {
        this.eta.setText(b.b(j10));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void hnj(as asVar, WeakReference<Context> weakReference, boolean z10) {
        String strBr;
        String strHnj;
        as asVar2;
        if (asVar == null) {
            return;
        }
        hnj(this.qor, oj.hnj());
        hnj(false, this.eum);
        sq.hnj(this.f13826ta, 0);
        sq.hnj((View) this.dnm, 0);
        sq.hnj(this.bug, 0);
        if (this.dnm != null && (asVar2 = this.tu) != null && asVar2.pwt() != null && this.tu.pwt().J() != null) {
            com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.tu.pwt().J(), this.tu.pwt().D(), this.tu.pwt().p(), this.dnm, this.tu);
        }
        if (!TextUtils.isEmpty(asVar.mw())) {
            strBr = asVar.mw();
        } else if (!TextUtils.isEmpty(asVar.kby())) {
            strBr = asVar.kby();
        } else if (!TextUtils.isEmpty(asVar.br())) {
            strBr = asVar.br();
        } else {
            strBr = "";
        }
        as asVar3 = this.tu;
        if (asVar3 != null && asVar3.mn() != null && this.tu.mn().hnj() != null) {
            sq.hnj((View) this.orl, 0);
            sq.hnj((View) this.mjg, 4);
            if (this.orl != null) {
                com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(this.tu.mn(), this.orl, asVar);
                this.orl.setOnClickListener(this.f13822gm);
                this.orl.setOnTouchListener(this.f13822gm);
            }
        } else if (!TextUtils.isEmpty(strBr)) {
            sq.hnj((View) this.orl, 4);
            sq.hnj((View) this.mjg, 0);
            TextView textView = this.mjg;
            if (textView != null) {
                textView.setText(strBr.substring(0, 1));
                this.mjg.setOnClickListener(this.f13822gm);
                this.mjg.setOnTouchListener(this.f13822gm);
            }
        }
        if (this.f13821fc != null && !TextUtils.isEmpty(strBr)) {
            this.f13821fc.setText(strBr);
        }
        sq.hnj((View) this.f13821fc, 0);
        sq.hnj((View) this.jip, 0);
        int iRg = asVar.rg();
        if (iRg == 4) {
            strHnj = wu.hnj(this.tgn, "tt_video_download_apk");
        } else if (iRg != 5) {
            strHnj = wu.hnj(this.tgn, "tt_video_mobile_go_detail");
        } else {
            strHnj = wu.hnj(this.tgn, "tt_video_dial_phone");
        }
        TextView textView2 = this.jip;
        if (textView2 != null) {
            textView2.setText(strHnj);
            this.jip.setOnClickListener(this.f13822gm);
            this.jip.setOnTouchListener(this.f13822gm);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public boolean hn(int i10) {
        SeekBar seekBar = this.lu;
        return seekBar != null && i10 > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void hnj(ViewGroup viewGroup) {
        if (viewGroup != null && (this.qor.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.izk = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.qor.getLayoutParams();
            this.f13806qb = marginLayoutParams.leftMargin;
            this.lhi = marginLayoutParams.topMargin;
            this.fr = marginLayoutParams.width;
            this.f13802gn = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.qor.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.dy = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.idl.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                sq.hnj(viewGroup, 0, 0, 0, 0);
            }
            hn(true);
            this.zt.setImageDrawable(wu.qor(this.tgn, "tt_shrink_video"));
            this.lu.setThumb(dnm.hnj(this.tgn, "tt_seek_thumb_fullscreen_selector"));
            this.lu.setThumbOffset(0);
            b.c(this.qor, false);
            sk(this.izk);
            sq.hnj(this.sq, 8);
            if (!this.eum) {
                sq.hnj((View) this.orp, 8);
                sq.hnj((View) this.fvt, 8);
            } else if ((this.f38do & 1) == 1) {
                sq.hnj((View) this.orp, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk, com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        if (message.what != 1) {
            return;
        }
        dnm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void hnj(boolean z10, boolean z11, boolean z12) {
        sq.hnj(this.f13810xo, 0);
        if (this.izk) {
            sq.hnj(this.sq, 0);
            sq.hnj((View) this.f13801ff, 0);
        } else if (z12) {
            sq.hnj(this.sq, 8);
        }
        sq.hnj((View) this.f13825sk, (!z10 || this.dkl.getVisibility() == 0) ? 8 : 0);
        if (!this.eum && !this.izk) {
            if ((this.f38do & 1) != 1 && !z12) {
                sq.hnj((View) this.orp, 0);
            }
            sq.hnj((View) this.fvt, z12 ? 8 : 0);
        }
        sq.hnj((View) this.rmr, 0);
        sq.hnj((View) this.eta, 0);
        sq.hnj((View) this.lu, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk
    public void hnj(boolean z10, boolean z11) {
        sq.hnj(this.f13810xo, 8);
        sq.hnj(this.sq, 8);
        sq.hnj((View) this.f13825sk, 8);
        if (!this.eum && !this.izk) {
            sq.hnj((View) this.orp, 8);
            if ((this.f38do & 2) != 2) {
                sq.hnj((View) this.fvt, 8);
            }
        } else if ((this.f38do & 1) == 1) {
            sq.hnj((View) this.orp, 8);
        }
        if (z11) {
            sq.hnj((View) this.orp, 8);
            sq.hnj((View) this.fvt, 8);
        }
        qor(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.sk, com.bytedance.sdk.openadsdk.core.widget.xn.hnj
    public void hnj(View view, boolean z10) {
        if (ta()) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            as asVar = this.tu;
            if (asVar != null && !TextUtils.isEmpty(asVar.kby())) {
                hnj(this.tu.kby());
            }
            this.xad.setText(str);
        } else {
            hnj("");
            this.xad.setText("");
        }
        if (this.hqh) {
            return;
        }
        qor(this.eum && !this.izk);
        if (jip()) {
            this.f13829vf.hnj(this, view, true, this.dkl.getVisibility() != 0);
        }
    }
}
