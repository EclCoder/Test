package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b6.a;
import b6.b;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.widget.jip;
import com.bytedance.sdk.openadsdk.core.widget.uua;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends com.bytedance.sdk.openadsdk.core.dkl.sk {
    private com.bytedance.sdk.openadsdk.component.reward.hnj.hnj aq;
    private TextView dkl;
    private boolean dse;
    private uua gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private TextView f13549hn;
    private jip hnj;
    private TextView qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private TextView f13550sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements com.bytedance.sdk.component.sk.jip {
        private final WeakReference<ImageView> gjv;

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final String f13552hn;
        private final as hnj;
        private final String qor;

        public hnj(ImageView imageView, as asVar, String str, String str2) {
            this.gjv = new WeakReference<>(imageView);
            this.hnj = asVar;
            this.f13552hn = str;
            this.qor = str2;
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
            Object objHn = dnmVar.hn();
            if (objHn != null) {
                ImageView imageView = this.gjv.get();
                if (objHn instanceof Bitmap) {
                    if (imageView != null) {
                        imageView.setImageBitmap((Bitmap) objHn);
                    }
                } else if (objHn instanceof Drawable) {
                    if (Build.VERSION.SDK_INT >= 28 && a.a(objHn)) {
                        b.a(objHn).start();
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) objHn);
                    }
                }
                com.bytedance.sdk.openadsdk.gjv.qor.hn(this.hnj, this.qor, "load_vast_icon_success", (JSONObject) null);
            }
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(int i10, String str, Throwable th2) {
            hnj(i10, str, this.f13552hn);
        }

        private void hnj(final int i10, final String str, final String str2) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(new com.bytedance.sdk.component.aq.hn.qor("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gjv.hnj.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i10);
                        jSONObject.put(dmHT.tCSIGJuSSgVmR, i10 + ":" + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.gjv.qor.hn(hnj.this.hnj, hnj.this.qor, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }

    public gjv(Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    private void dkl() {
        Context context = getContext();
        setPadding(sq.hn(context, 16.0f), sq.hn(context, 16.0f), sq.hn(context, 16.0f), sq.hn(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setOrientation(0);
        skVar.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = sq.hn(context, 12.0f);
        addView(skVar, layoutParams);
        uua uuaVar = new uua(context);
        this.gjv = uuaVar;
        uuaVar.setBackgroundColor(0);
        this.gjv.setId(com.bytedance.sdk.openadsdk.utils.jip.gjv);
        skVar.addView(this.gjv, new LinearLayout.LayoutParams(sq.hn(context, 48.0f), sq.hn(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = sq.hn(context, 12.0f);
        skVar.addView(skVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f13550sk = aqVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar.setEllipsize(truncateAt);
        this.f13550sk.setGravity(16);
        this.f13550sk.setSingleLine(true);
        this.f13550sk.setTextSize(2, 17.0f);
        this.f13550sk.setId(com.bytedance.sdk.openadsdk.utils.jip.f14679sk);
        this.f13550sk.setTextColor(-16777216);
        skVar2.addView(this.f13550sk, new LinearLayout.LayoutParams(-1, -2));
        jip jipVar = new jip(context);
        this.hnj = jipVar;
        jipVar.setId(com.bytedance.sdk.openadsdk.utils.jip.dse);
        skVar2.addView(this.hnj, new LinearLayout.LayoutParams(-2, sq.hn(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f13549hn = aqVar2;
        aqVar2.setGravity(17);
        this.f13549hn.setEllipsize(truncateAt);
        this.f13549hn.setSingleLine(true);
        this.f13549hn.setTextColor(-1);
        this.f13549hn.setTextSize(2, 16.0f);
        this.f13549hn.setId(520093705);
        this.f13549hn.setBackground(hnj(context));
        this.f13549hn.setText(this.aq.f13456hn.cq());
        addView(this.f13549hn, new LinearLayout.LayoutParams(-1, sq.hn(context, 36.0f)));
    }

    private String getCnOrEnBtnText() {
        return this.aq.f13456hn.rg() != 4 ? "View" : "Install";
    }

    private void gjv() {
        this.dse = true;
        as asVar = this.aq.f13456hn;
        int iQb = asVar.qb();
        if ((iQb == 43 || iQb == 44) && hqh.hn(asVar)) {
            qor();
        } else if (this.aq.lu == 1) {
            dkl();
        } else {
            sk();
        }
        if (this.f13549hn == null) {
            this.f13549hn = (TextView) this.aq.fvt.findViewById(520093705);
        }
        TextView textView = this.f13549hn;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gjv.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    int width = ((ViewGroup) gjv.this.f13549hn.getParent()).getWidth();
                    if (width > 0) {
                        gjv.this.f13549hn.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (!asVar.qs()) {
                this.f13549hn.setText(asVar.vh() == 3 ? getButtonTextForNewStyleBar() : asVar.cq());
            } else if (asVar.mzt() != null && TextUtils.isEmpty(asVar.mzt().dkl())) {
                sq.hnj((View) this.f13549hn, 8);
            }
        }
        if (this.gjv != null && asVar.mn() != null && !TextUtils.isEmpty(asVar.mn().hnj())) {
            String strHnj = asVar.mn().hnj();
            if (asVar.qs()) {
                com.bytedance.sdk.openadsdk.ta.gjv.hnj(asVar.mn()).qor(1).hnj(new com.bytedance.sdk.openadsdk.ta.hn(asVar, asVar.mn().hnj(), new hnj(this.gjv, asVar, strHnj, this.aq.f13461sk)));
                if (asVar.mzt() != null && asVar.mzt().hn() != null) {
                    asVar.mzt().hn().hn(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(asVar.mn(), this.gjv, asVar);
            }
        }
        TextView textView2 = this.f13550sk;
        if (textView2 != null) {
            textView2.setText(asVar.kby());
        }
        TextView textView3 = this.dkl;
        if (textView3 != null) {
            textView3.setText(hnj(asVar));
        }
        if (this.qor != null) {
            String strAs = hqh.as(this.aq.f13456hn);
            if (TextUtils.isEmpty(strAs)) {
                strAs = "Play now";
            }
            this.qor.setText(strAs);
            this.qor.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gjv.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (gjv.this.aq != null) {
                        com.bytedance.sdk.openadsdk.component.reward.hn.hnj(gjv.this.aq);
                    }
                }
            });
        }
        jip jipVar = this.hnj;
        if (jipVar != null) {
            sq.hnj((TextView) null, jipVar, asVar);
        }
        if (this.aq.lu == 2 && asVar.vh() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13549hn.getLayoutParams();
            layoutParams.height = sq.hn(this.aq.jbd, 55.0f);
            layoutParams.topMargin = sq.hn(this.aq.jbd, 20.0f);
            this.f13549hn.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = sq.hn(this.aq.jbd, 12.0f);
            setLayoutParams(layoutParams2);
        }
        hn();
    }

    private void sk() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(sq.hn(context, 16.0f), sq.hn(context, 12.0f), sq.hn(context, 16.0f), sq.hn(context, 12.0f));
        uua uuaVar = new uua(context);
        this.gjv = uuaVar;
        uuaVar.setBackgroundColor(0);
        this.gjv.setId(com.bytedance.sdk.openadsdk.utils.jip.gjv);
        addView(this.gjv, new LinearLayout.LayoutParams(sq.hn(context, 48.0f), sq.hn(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = sq.hn(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(skVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f13550sk = aqVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar.setEllipsize(truncateAt);
        this.f13550sk.setGravity(16);
        this.f13550sk.setSingleLine(true);
        this.f13550sk.setTextSize(2, 17.0f);
        this.f13550sk.setId(com.bytedance.sdk.openadsdk.utils.jip.f14679sk);
        this.f13550sk.setTextColor(-16777216);
        skVar.addView(this.f13550sk, new LinearLayout.LayoutParams(-1, -2));
        jip jipVar = new jip(context);
        this.hnj = jipVar;
        jipVar.setId(com.bytedance.sdk.openadsdk.utils.jip.dse);
        skVar.addView(this.hnj, new LinearLayout.LayoutParams(-2, sq.hn(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f13549hn = aqVar2;
        aqVar2.setGravity(17);
        this.f13549hn.setEllipsize(truncateAt);
        this.f13549hn.setSingleLine(true);
        this.f13549hn.setTextColor(-1);
        this.f13549hn.setTextSize(2, 16.0f);
        this.f13549hn.setId(520093705);
        this.f13549hn.setBackground(hnj(context));
        this.f13549hn.setText(this.aq.f13456hn.cq());
        addView(this.f13549hn, new LinearLayout.LayoutParams(sq.hn(context, 164.0f), sq.hn(context, 36.0f)));
    }

    protected String getButtonTextForNewStyleBar() {
        boolean zEquals;
        String strCq;
        String strQor = orp.qor(this.aq.jbd);
        if (strQor == null) {
            strQor = "";
        }
        try {
            zEquals = strQor.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            zEquals = false;
        }
        if (TextUtils.isEmpty(this.aq.f13456hn.cq())) {
            strCq = this.aq.f13456hn.rg() != 4 ? "View" : "Install";
        } else {
            strCq = this.aq.f13456hn.cq();
            if (strCq == null || !orp.dse(strCq) || strCq.length() <= 2) {
                if (strCq != null && !orp.dse(strCq) && strCq.length() > 7 && zEquals) {
                    strCq = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strCq = getCnOrEnBtnText();
            }
        }
        if (zEquals && !orp.dse(strCq)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13549hn.getLayoutParams();
            layoutParams.bottomMargin = sq.hn(this.aq.jbd, 4.0f);
            this.f13549hn.setLayoutParams(layoutParams);
        }
        return strCq;
    }

    public void qor() {
        Context context = getContext();
        int iHn = sq.hn(context, 12.0f);
        setPadding(iHn, iHn, iHn, iHn);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        skVar.setOrientation(0);
        skVar.setGravity(16);
        addView(skVar, layoutParams);
        uua uuaVar = new uua(context);
        this.gjv = uuaVar;
        uuaVar.setBackgroundColor(0);
        this.gjv.setId(com.bytedance.sdk.openadsdk.utils.jip.gjv);
        skVar.addView(this.gjv, new LinearLayout.LayoutParams(sq.hn(context, 54.0f), sq.hn(context, 54.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = sq.hn(context, 12.0f);
        skVar.addView(skVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f13550sk = aqVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar.setEllipsize(truncateAt);
        this.f13550sk.setGravity(16);
        this.f13550sk.setSingleLine(true);
        this.f13550sk.setTextSize(2, 17.0f);
        this.f13550sk.setId(com.bytedance.sdk.openadsdk.utils.jip.f14679sk);
        this.f13550sk.setTextColor(-16777216);
        skVar2.addView(this.f13550sk, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.dkl = aqVar2;
        aqVar2.setTextColor(-16777216);
        this.dkl.setTextSize(2, 13.0f);
        this.dkl.setMaxLines(2);
        this.dkl.setAlpha(0.8f);
        this.dkl.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = sq.hn(context, 4.0f);
        skVar2.addView(this.dkl, layoutParams3);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar3 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = sq.hn(context, 12.0f);
        skVar3.setOrientation(0);
        addView(skVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.qor = aqVar3;
        aqVar3.setGravity(17);
        this.qor.setEllipsize(truncateAt);
        this.qor.setSingleLine(true);
        this.qor.setTextColor(-16777216);
        this.qor.setTextSize(2, 16.0f);
        this.qor.setBackground(hn(context));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, sq.hn(context, 36.0f), 1.0f);
        layoutParams5.rightMargin = sq.hn(context, 3.0f);
        skVar3.addView(this.qor, layoutParams5);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar4 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f13549hn = aqVar4;
        aqVar4.setGravity(17);
        this.f13549hn.setEllipsize(truncateAt);
        this.f13549hn.setSingleLine(true);
        this.f13549hn.setTextColor(-1);
        this.f13549hn.setTextSize(2, 16.0f);
        this.f13549hn.setId(520093705);
        this.f13549hn.setBackground(qor(context));
        this.f13549hn.setText(this.aq.f13456hn.cq());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, sq.hn(context, 36.0f), 1.0f);
        layoutParams6.leftMargin = sq.hn(context, 3.0f);
        skVar3.addView(this.f13549hn, layoutParams6);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0 || this.dse) {
            return;
        }
        gjv();
    }

    private String hnj(as asVar) {
        if (TextUtils.isEmpty(asVar.kby())) {
            return !TextUtils.isEmpty(asVar.br()) ? asVar.br() : "";
        }
        return asVar.kby();
    }

    public void hn() {
        com.bytedance.sdk.openadsdk.core.qor.sk skVarSk = this.aq.tgn.sk();
        final com.bytedance.sdk.openadsdk.core.qor.hn hnVarGjv = this.aq.tgn.gjv();
        final as asVar = this.aq.f13456hn;
        if (asVar.dl() == null) {
            return;
        }
        if (asVar.vh() != 5 && this.f13549hn != null) {
            if (asVar.dl().f13954sk) {
                this.f13549hn.setOnClickListener(skVarSk);
                this.f13549hn.setOnTouchListener(skVarSk);
            } else {
                this.f13549hn.setOnClickListener(hnVarGjv);
            }
        }
        if (asVar.vh() == 1) {
            if (!asVar.dl().hnj) {
                sq.hnj((View) this, (View.OnClickListener) hnVarGjv, "TTBaseVideoActivity#mRlDownloadBar");
                this.f13550sk.setOnClickListener(hnVarGjv);
                this.hnj.setOnClickListener(hnVarGjv);
                this.gjv.setOnClickListener(hnVarGjv);
                return;
            }
            sq.hnj((View) this, (View.OnClickListener) skVarSk, "TTBaseVideoActivity#mRlDownloadBar");
            sq.hnj((View) this, (View.OnTouchListener) skVarSk, "TTBaseVideoActivity#mRlDownloadBar");
            this.f13550sk.setOnClickListener(skVarSk);
            this.f13550sk.setOnTouchListener(skVarSk);
            this.hnj.setOnClickListener(skVarSk);
            this.hnj.setOnTouchListener(skVarSk);
            this.gjv.setOnClickListener(skVarSk);
            this.gjv.setOnTouchListener(skVarSk);
            return;
        }
        if (asVar.vh() != 5) {
            if (!asVar.dl().qor) {
                sq.hnj((View) this, (View.OnClickListener) hnVarGjv, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            } else {
                sq.hnj((View) this, (View.OnClickListener) skVarSk, "TTBaseVideoActivity#mRlDownloadBar");
                sq.hnj((View) this, (View.OnTouchListener) skVarSk, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            }
        }
        String str = "VAST_ICON";
        if (!asVar.dl().f13954sk) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gjv.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = hnVarGjv;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view == null || !"VAST_ICON".equals(view.getTag(570425345))) {
                        if (asVar.mzt() != null) {
                            asVar.mzt().hnj().dse(gjv.this.aq.eum.orl());
                        }
                    } else {
                        if (asVar.mzt() == null || asVar.mzt().hn() == null) {
                            return;
                        }
                        asVar.mzt().hn().hnj(gjv.this.aq.eum.orl());
                    }
                }
            };
            TextView textView = this.f13549hn;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
            TextView textView2 = this.f13550sk;
            if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                this.f13550sk.setOnClickListener(onClickListener);
            }
            uua uuaVar = this.gjv;
            if (uuaVar != null) {
                uuaVar.setTag(570425345, "VAST_ICON");
                this.gjv.setOnClickListener(hnVarGjv);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.qor.dse dseVar = new com.bytedance.sdk.openadsdk.core.qor.dse("VAST_ACTION_BUTTON", asVar.mzt(), skVarSk) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gjv.3
        };
        com.bytedance.sdk.openadsdk.core.qor.dse dseVar2 = new com.bytedance.sdk.openadsdk.core.qor.dse(str, asVar.mzt(), skVarSk) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gjv.4
        };
        TextView textView3 = this.f13549hn;
        if (textView3 != null) {
            textView3.setOnClickListener(dseVar);
            this.f13549hn.setOnTouchListener(dseVar);
        }
        uua uuaVar2 = this.gjv;
        if (uuaVar2 != null) {
            uuaVar2.setOnClickListener(dseVar2);
            this.gjv.setOnTouchListener(dseVar2);
        }
        TextView textView4 = this.f13550sk;
        if (textView4 == null || TextUtils.isEmpty(textView4.getText())) {
            return;
        }
        this.f13550sk.setOnClickListener(dseVar);
        this.f13550sk.setOnTouchListener(dseVar);
    }

    public void hnj() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.aq = hnjVar;
        if (hnjVar.f13456hn.vh() == 1) {
            gjv();
        }
    }

    private static Drawable hnj(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(sq.hn(context, 18.0f));
        return gradientDrawable;
    }

    private static Drawable hn(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#000000"));
        gradientDrawable.setAlpha(30);
        gradientDrawable.setCornerRadius(sq.hn(context, 8.0f));
        return gradientDrawable;
    }

    private static Drawable qor(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FE2C55"));
        gradientDrawable.setCornerRadius(sq.hn(context, 8.0f));
        return gradientDrawable;
    }
}
