package com.hecorat.screenrecorder.free.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ShareEditedFileActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import kf.o;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import nh.f0;
import nh.l0;
import tf.g0;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/ShareEditedFileActivity;", "Lff/b;", "Landroid/view/View$OnClickListener;", "Lkf/o;", "<init>", "()V", "", "isFirstCreate", "Lfl/g0;", "D0", "(Z)V", "Lvg/b;", NotificationCompat.CATEGORY_PROMO, "F0", "(Lvg/b;)V", "H0", "G0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "onResume", "onDestroy", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Ltg/c;", "shareableApp", CampaignEx.JSON_KEY_AD_R, "(Ltg/c;)V", "", "c", "Ljava/lang/String;", "mediaType", "Landroid/net/Uri;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/net/Uri;", "mediaUri", "Llf/i;", "e", "Llf/i;", "hybridAdsManager", "Ltf/g0;", "f", "Ltf/g0;", "binding", "g", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShareEditedFileActivity extends ff.b implements o, View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String mediaType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Uri mediaUri;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public lf.i hybridAdsManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public g0 binding;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            g0 g0Var = ShareEditedFileActivity.this.binding;
            if (g0Var == null) {
                s.w(WwUgngZLNA.GURv);
                g0Var = null;
            }
            g0Var.B.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            lf.i iVar = ShareEditedFileActivity.this.hybridAdsManager;
            if (iVar != null) {
                iVar.k();
            }
        }
    }

    private final void D0(boolean isFirstCreate) {
        final vg.b bVarA = vg.b.f55513f.a(getIntent().getStringExtra("dedicated_app_promo"));
        g0 g0Var = null;
        if (bVarA == null || !vg.c.f55523a.g(this, bVarA)) {
            g0 g0Var2 = this.binding;
            if (g0Var2 == null) {
                s.w("binding");
            } else {
                g0Var = g0Var2;
            }
            g0Var.D.setVisibility(8);
            return;
        }
        g0 g0Var3 = this.binding;
        if (g0Var3 == null) {
            s.w("binding");
            g0Var3 = null;
        }
        g0Var3.E.setImageResource(bVarA.i());
        g0 g0Var4 = this.binding;
        if (g0Var4 == null) {
            s.w("binding");
            g0Var4 = null;
        }
        g0Var4.G.setText(bVarA.g());
        g0 g0Var5 = this.binding;
        if (g0Var5 == null) {
            s.w("binding");
            g0Var5 = null;
        }
        g0Var5.F.setText(bVarA.k());
        g0 g0Var6 = this.binding;
        if (g0Var6 == null) {
            s.w("binding");
            g0Var6 = null;
        }
        g0Var6.D.setOnClickListener(new View.OnClickListener() { // from class: ff.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareEditedFileActivity.E0(this.f38579a, bVarA, view);
            }
        });
        g0 g0Var7 = this.binding;
        if (g0Var7 == null) {
            s.w("binding");
        } else {
            g0Var = g0Var7;
        }
        g0Var.D.setVisibility(0);
        if (isFirstCreate) {
            F0(bVarA);
        }
    }

    public static final void E0(ShareEditedFileActivity shareEditedFileActivity, vg.b bVar, View view) {
        vg.c.f55523a.f(shareEditedFileActivity, bVar, "share_screen");
    }

    private final void F0(vg.b promo) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "impression");
        bundle.putString(CampaignEx.JSON_KEY_PACKAGE_NAME, promo.j());
        bundle.putString("action_source", "share_screen");
        FirebaseAnalytics.getInstance(this).a("dedicated_app_promo", bundle);
    }

    private final void G0() {
        g0 g0Var = this.binding;
        if (g0Var == null) {
            s.w("binding");
            g0Var = null;
        }
        u0(g0Var.O);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
            aVarL0.A(true);
        }
    }

    private final void H0() {
        g0 g0Var = null;
        if (!s.c(this.mediaType, "video/*")) {
            g0 g0Var2 = this.binding;
            if (g0Var2 == null) {
                s.w("binding");
                g0Var2 = null;
            }
            g0Var2.J.setVisibility(8);
        }
        com.bumptech.glide.k kVar = (com.bumptech.glide.k) com.bumptech.glide.c.C(this).r(this.mediaUri).k();
        g0 g0Var3 = this.binding;
        if (g0Var3 == null) {
            s.w("binding");
        } else {
            g0Var = g0Var3;
        }
        kVar.A0(g0Var.N);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        s.h(v10, "v");
        if (v10.getId() == R.id.media_layout) {
            if (s.c(this.mediaType, "video/*")) {
                f0.D(this, this.mediaUri, 3);
            } else {
                f0.A(this, this.mediaUri, 3);
            }
        }
    }

    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        AzRecorderApp.d().I(this);
        super.onCreate(savedInstanceState);
        g0 g0Var = (g0) androidx.databinding.g.j(this, R.layout.activity_share_edited_file);
        this.binding = g0Var;
        g0 g0Var2 = null;
        if (g0Var == null) {
            s.w("binding");
            g0Var = null;
        }
        View viewB = g0Var.B();
        s.g(viewB, "getRoot(...)");
        y0(viewB);
        Intent intent = getIntent();
        this.mediaUri = intent.getData();
        this.mediaType = intent.getStringExtra("mime_type");
        H0();
        D0(savedInstanceState == null);
        if (!l0.o()) {
            lf.l lVarA = lf.l.f44461f.a(lf.l.a.SHARE);
            lf.c cVarA = lf.c.f44397g.a(lf.c.a.SHARE);
            g0 g0Var3 = this.binding;
            if (g0Var3 == null) {
                s.w("binding");
                g0Var3 = null;
            }
            RelativeLayout relativeLayout = g0Var3.B;
            g0 g0Var4 = this.binding;
            if (g0Var4 == null) {
                s.w("binding");
                g0Var4 = null;
            }
            lf.i iVar = new lf.i(lVarA, cVarA, relativeLayout, g0Var4.H.G, null, true, 16, null);
            this.hybridAdsManager = iVar;
            iVar.i();
            g0 g0Var5 = this.binding;
            if (g0Var5 == null) {
                s.w("binding");
                g0Var5 = null;
            }
            g0Var5.B.getViewTreeObserver().addOnGlobalLayoutListener(new b());
        }
        G0();
        List listS = nh.e.s(this, this.mediaType);
        if (listS.size() > 3) {
            listS = listS.subList(0, 3);
        }
        Drawable drawable = androidx.core.content.a.getDrawable(this, R.drawable.round_apps_24);
        s.e(drawable);
        listS.add(new tg.c("More apps", "more_package", "more", drawable, -1));
        s.e(listS);
        kf.s sVar = new kf.s(listS, this);
        g0 g0Var6 = this.binding;
        if (g0Var6 == null) {
            s.w("binding");
            g0Var6 = null;
        }
        g0Var6.L.setLayoutManager(new GridLayoutManager(this, 4));
        g0 g0Var7 = this.binding;
        if (g0Var7 == null) {
            s.w("binding");
            g0Var7 = null;
        }
        g0Var7.L.setAdapter(sVar);
        g0 g0Var8 = this.binding;
        if (g0Var8 == null) {
            s.w("binding");
        } else {
            g0Var2 = g0Var8;
        }
        g0Var2.I.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        lf.i iVar = this.hybridAdsManager;
        if (iVar != null) {
            iVar.h();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        s.h(item, "item");
        if (item.getItemId() == 16908332) {
            getOnBackPressedDispatcher().l();
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onPause() {
        lf.i iVar = this.hybridAdsManager;
        if (iVar != null) {
            iVar.f();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.app.Activity
    public void onResume() {
        lf.i iVar = this.hybridAdsManager;
        if (iVar != null) {
            iVar.j();
        }
        super.onResume();
    }

    @Override // kf.o
    public void r(tg.c shareableApp) {
        s.h(shareableApp, "shareableApp");
        wp.a.g("Share via %s", shareableApp.d());
        if (s.c(shareableApp.d(), "more_package")) {
            f0.K(this, this.mediaUri, this.mediaType);
        } else {
            f0.J(this, this.mediaUri, this.mediaType, shareableApp);
        }
    }
}
