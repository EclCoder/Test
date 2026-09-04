package com.hecorat.screenrecorder.free.activities;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.d0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import fl.g0;
import fl.w;
import gl.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kf.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import nh.j0;
import nh.l0;
import wf.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 {2\u00020\u0001:\u0003|}.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J!\u0010\u0013\u001a\u00020\n2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u00042\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\"H\u0007¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\tJ!\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010\u0003R$\u00100\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00105R\u0016\u0010>\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00105R\u0016\u0010@\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00109R\u0016\u0010B\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00109RH\u0010H\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00040D0Cj\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00040D`E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00105R\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010c\u001a\u00020`8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0014\u0010z\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006~"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/UpgradeActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "", "T0", "()Ljava/lang/String;", "", "S0", "()Z", "Lfl/g0;", "j1", "productId", "h1", "(Ljava/lang/String;)V", "n1", "e1", "", "purchaseList", "g1", "(Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "hasFocus", "onWindowFocusChanged", "(Z)V", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Landroid/app/Activity;", "activity", "Lkotlin/Function1;", "onLaunchResult", "O0", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "R0", "action", "X0", "(Ljava/lang/String;Ljava/lang/String;)V", "onDestroy", "Ljava/util/ArrayList;", "Lcom/hecorat/screenrecorder/free/activities/UpgradeActivity$c;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "productDisplayInfoList", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/util/List;", "shownProducts", "e", "Ljava/lang/String;", "promoProduct", "", "f", "J", "promoPrice", "g", "promoFormatPrice", "h", "anchorProduct", "i", "anchorPrice", "j", "maxShownOneTimePrice", "Ljava/util/HashMap;", "Lfl/q;", "Lkotlin/collections/HashMap;", CampaignEx.JSON_KEY_AD_K, "Ljava/util/HashMap;", "priceByProduct", "l", "upgradeProductLayout", "m", "Z", "hasBeenSorted", "n", "hasChosenDefault", "Lkf/y;", "o", "Lkf/y;", "upgradeProductAdapter", "Lqf/j;", TtmlNode.TAG_P, "Lqf/j;", "billingDataSource", "Landroidx/recyclerview/widget/RecyclerView;", CampaignEx.JSON_KEY_AD_Q, "Landroidx/recyclerview/widget/RecyclerView;", "upgradeProductRv", "Landroid/widget/ProgressBar;", CampaignEx.JSON_KEY_AD_R, "Landroid/widget/ProgressBar;", "loadingPb", "Ljava/lang/Runnable;", "s", "Ljava/lang/Runnable;", "billingReadyRunnable", "Landroid/os/Handler;", "t", "Landroid/os/Handler;", "billingWaitHandler", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "u", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "V0", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setMFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "mFirebaseAnalytics", "Llg/a;", "v", "Llg/a;", "W0", "()Llg/a;", "setMPreferenceManager", "(Llg/a;)V", "mPreferenceManager", "U0", "()J", "fullPrice", "w", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpgradeActivity extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public List shownProducts;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long promoPrice;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public long anchorPrice;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public long maxShownOneTimePrice;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean hasBeenSorted;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean hasChosenDefault;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public y upgradeProductAdapter;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public qf.j billingDataSource;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public RecyclerView upgradeProductRv;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public ProgressBar loadingPb;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Runnable billingReadyRunnable;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public FirebaseAnalytics mFirebaseAnalytics;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public lg.a mPreferenceManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final ArrayList productDisplayInfoList = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String promoProduct = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public String promoFormatPrice = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public String anchorProduct = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final HashMap priceByProduct = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public String upgradeProductLayout = "vertical";

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final Handler billingWaitHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f22713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f22714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f22715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f22716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Currency f22717g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f22718h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f22719i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f22720j;

        public c(String id2, String title, String description, String type, int i10, long j10, Currency currency, String formattedPrice, int i11, boolean z10) {
            s.h(id2, "id");
            s.h(title, "title");
            s.h(description, "description");
            s.h(type, "type");
            s.h(currency, "currency");
            s.h(formattedPrice, "formattedPrice");
            this.f22711a = id2;
            this.f22712b = title;
            this.f22713c = description;
            this.f22714d = type;
            this.f22715e = i10;
            this.f22716f = j10;
            this.f22717g = currency;
            this.f22718h = formattedPrice;
            this.f22719i = i11;
            this.f22720j = z10;
        }

        public final int a() {
            return this.f22715e;
        }

        public final Currency b() {
            return this.f22717g;
        }

        public final String c() {
            return this.f22718h;
        }

        public final String d() {
            return this.f22711a;
        }

        public final long e() {
            return this.f22716f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.c(this.f22711a, cVar.f22711a) && s.c(this.f22712b, cVar.f22712b) && s.c(this.f22713c, cVar.f22713c) && s.c(this.f22714d, cVar.f22714d) && this.f22715e == cVar.f22715e && this.f22716f == cVar.f22716f && s.c(this.f22717g, cVar.f22717g) && s.c(this.f22718h, cVar.f22718h) && this.f22719i == cVar.f22719i && this.f22720j == cVar.f22720j;
        }

        public final String f() {
            return this.f22712b;
        }

        public final int g() {
            return this.f22719i;
        }

        public final String h() {
            return this.f22714d;
        }

        public int hashCode() {
            return (((((((((((((((((this.f22711a.hashCode() * 31) + this.f22712b.hashCode()) * 31) + this.f22713c.hashCode()) * 31) + this.f22714d.hashCode()) * 31) + Integer.hashCode(this.f22715e)) * 31) + Long.hashCode(this.f22716f)) * 31) + this.f22717g.hashCode()) * 31) + this.f22718h.hashCode()) * 31) + Integer.hashCode(this.f22719i)) * 31) + Boolean.hashCode(this.f22720j);
        }

        public final boolean i() {
            return this.f22720j;
        }

        public final void j(boolean z10) {
            this.f22720j = z10;
        }

        public String toString() {
            return "ProductDisplayInfo(id=" + this.f22711a + ", title=" + this.f22712b + ", description=" + this.f22713c + ", type=" + this.f22714d + ", billingPeriod=" + this.f22715e + ", priceMicros=" + this.f22716f + ", currency=" + this.f22717g + ", formattedPrice=" + this.f22718h + ", trialDays=" + this.f22719i + ", isSelected=" + this.f22720j + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends RecyclerView.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f22721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f22722b;

        public d(RecyclerView recyclerView, ImageView imageView) {
            this.f22721a = recyclerView;
            this.f22722b = imageView;
        }

        public static final void b(RecyclerView recyclerView, ImageView imageView) {
            boolean zCanScrollVertically = recyclerView.canScrollVertically(1);
            wp.a.a("onScrolled canScrollDown: " + zCanScrollVertically, new Object[0]);
            imageView.setVisibility(zCanScrollVertically ? 0 : 8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrolled(final RecyclerView recyclerView, int i10, int i11) {
            s.h(recyclerView, "recyclerView");
            RecyclerView recyclerView2 = this.f22721a;
            final ImageView imageView = this.f22722b;
            recyclerView2.post(new Runnable() { // from class: ff.y1
                @Override // java.lang.Runnable
                public final void run() {
                    UpgradeActivity.d.b(recyclerView, imageView);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!qf.j.E()) {
                UpgradeActivity.this.billingWaitHandler.postDelayed(this, 100L);
                return;
            }
            UpgradeActivity.this.billingDataSource = qf.j.x();
            UpgradeActivity.this.j1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends d0 {
        public f() {
            super(true);
        }

        @Override // androidx.activity.d0
        public void d() {
            if (UpgradeActivity.this.S0()) {
                return;
            }
            UpgradeActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g implements m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f22725a;

        public g(Function1 function) {
            s.h(function, "function");
            this.f22725a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f22725a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f22725a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof m)) {
                return s.c(a(), ((m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class h implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.a.a(((c) obj2).h(), ((c) obj).h());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f22726a;

        public i(Comparator comparator) {
            this.f22726a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f22726a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : jl.a.a(Integer.valueOf(((c) obj).a()), Integer.valueOf(((c) obj2).a()));
        }
    }

    public static /* synthetic */ void P0(UpgradeActivity upgradeActivity, Activity activity, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        upgradeActivity.O0(activity, str, function1);
    }

    public static final void Q0(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S0() {
        int iG;
        if (this.promoProduct.length() == 0 || this.promoPrice == 0 || U0() == 0 || this.promoPrice >= U0() || (iG = l0.g(W0())) == -1 || iG == 3) {
            return false;
        }
        long jE = W0().e(R.string.pref_current_promo_duration, 0L);
        if (iG == 1) {
            W0().l(R.string.pref_current_promo_start_time, System.currentTimeMillis());
        } else {
            jE -= System.currentTimeMillis() - W0().e(R.string.pref_current_promo_start_time, 0L);
        }
        long j10 = jE;
        if (j10 <= 0) {
            return false;
        }
        q.Companion aVar = q.INSTANCE;
        String str = this.promoProduct;
        String str2 = this.promoFormatPrice;
        String string = getString(R.string.percent, Integer.valueOf((int) (((U0() - this.promoPrice) * ((long) 100)) / U0())));
        s.g(string, "getString(...)");
        aVar.a(str, str2, string, j10).show(getSupportFragmentManager(), "PromoDialog");
        X0("promo_shown", this.promoProduct);
        return true;
    }

    private final String T0() {
        int i10 = getResources().getConfiguration().screenWidthDp;
        int i11 = getResources().getConfiguration().screenHeightDp;
        wp.a.a("Screen width dp: " + i10 + ", height dp: " + i11, new Object[0]);
        return (getResources().getConfiguration().orientation != 2 && i11 < 800) ? "horizontal" : "vertical";
    }

    private final long U0() {
        long j10 = this.anchorPrice;
        return j10 > 0 ? j10 : this.maxShownOneTimePrice;
    }

    public static /* synthetic */ void Y0(UpgradeActivity upgradeActivity, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        upgradeActivity.X0(str, str2);
    }

    public static final void Z0(UpgradeActivity upgradeActivity, View view) {
        upgradeActivity.e1();
    }

    public static final void a1(UpgradeActivity upgradeActivity, View view) {
        Intent intent = new Intent(upgradeActivity, (Class<?>) WebViewActivity.class);
        intent.putExtra(WebViewActivity.f22764d, "https://risenapps.com/az/privacy_policy.html");
        upgradeActivity.startActivity(intent);
    }

    public static final void b1(UpgradeActivity upgradeActivity, View view) {
        Intent intent = new Intent(upgradeActivity, (Class<?>) WebViewActivity.class);
        intent.putExtra(WebViewActivity.f22764d, "https://risenapps.com/az/tos.html");
        upgradeActivity.startActivity(intent);
    }

    public static final void c1(RecyclerView recyclerView, View view) {
        recyclerView.A1(0, 200);
    }

    public static final void d1(UpgradeActivity upgradeActivity, View view) {
        if (upgradeActivity.S0()) {
            return;
        }
        upgradeActivity.finish();
    }

    private final void e1() {
        new AlertDialog.Builder(this, R.style.GeneralDialogTheme).setIcon(R.drawable.ic_info_orange_24dp).setTitle(R.string.dialog_already_have_premium_title).setMessage(R.string.dialog_already_have_premium_msg).setPositiveButton(R.string.close, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.contact_support, new DialogInterface.OnClickListener() { // from class: ff.m1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                UpgradeActivity.f1(this.f38545a, dialogInterface, i10);
            }
        }).show();
    }

    public static final void f1(UpgradeActivity upgradeActivity, DialogInterface dialogInterface, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_feedback_type", 2);
        wf.l lVar = new wf.l();
        lVar.setArguments(bundle);
        lVar.show(upgradeActivity.getSupportFragmentManager(), "feedback dialog");
    }

    private final void g1(List purchaseList) {
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("action_source") : null;
        s.e(purchaseList);
        Iterator it = purchaseList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            if (stringExtra != null) {
                bundle.putString("action_source", stringExtra);
            }
            bundle.putString("product_id", str);
            fl.q qVar = (fl.q) this.priceByProduct.get(str);
            if (qVar != null) {
                long jLongValue = ((Number) qVar.d()).longValue();
                String str2 = (String) qVar.g();
                bundle.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, jLongValue / 1000000.0d);
                bundle.putString("currency", str2);
            }
            V0().a("upgrade_pro", bundle);
        }
    }

    private final void h1(final String productId) {
        qf.j jVar = this.billingDataSource;
        if (jVar == null) {
            s.w("billingDataSource");
            jVar = null;
        }
        jVar.B(productId).j(this, new g(new Function1() { // from class: ff.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpgradeActivity.i1(this.f38548a, productId, (UpgradeActivity.c) obj);
            }
        }));
    }

    public static final g0 i1(UpgradeActivity upgradeActivity, String str, c cVar) {
        upgradeActivity.priceByProduct.put(cVar.d(), w.a(Long.valueOf(cVar.e()), cVar.b().getCurrencyCode()));
        int size = upgradeActivity.productDisplayInfoList.size();
        int size2 = 0;
        while (true) {
            if (size2 >= size) {
                size2 = -1;
                break;
            }
            if (s.c(((c) upgradeActivity.productDisplayInfoList.get(size2)).d(), str)) {
                upgradeActivity.productDisplayInfoList.set(size2, cVar);
                break;
            }
            size2++;
        }
        if (size2 == -1) {
            upgradeActivity.productDisplayInfoList.add(cVar);
            size2 = upgradeActivity.productDisplayInfoList.size() - 1;
        }
        y yVar = upgradeActivity.upgradeProductAdapter;
        y yVar2 = null;
        if (yVar == null) {
            s.w("upgradeProductAdapter");
            yVar = null;
        }
        yVar.notifyItemChanged(size2);
        if (upgradeActivity.productDisplayInfoList.size() > 0) {
            ProgressBar progressBar = upgradeActivity.loadingPb;
            if (progressBar == null) {
                s.w("loadingPb");
                progressBar = null;
            }
            progressBar.setVisibility(8);
        }
        if (!upgradeActivity.hasBeenSorted) {
            int size3 = upgradeActivity.productDisplayInfoList.size();
            List list = upgradeActivity.shownProducts;
            if (list == null) {
                s.w("shownProducts");
                list = null;
            }
            if (size3 == list.size()) {
                upgradeActivity.hasBeenSorted = true;
                r.y(upgradeActivity.productDisplayInfoList, new i(new h()));
                y yVar3 = upgradeActivity.upgradeProductAdapter;
                if (yVar3 == null) {
                    s.w("upgradeProductAdapter");
                    yVar3 = null;
                }
                yVar3.notifyDataSetChanged();
            }
        }
        if (!upgradeActivity.hasChosenDefault) {
            int size4 = upgradeActivity.productDisplayInfoList.size();
            List list2 = upgradeActivity.shownProducts;
            if (list2 == null) {
                s.w("shownProducts");
                list2 = null;
            }
            if (size4 == list2.size()) {
                Object obj = upgradeActivity.productDisplayInfoList.get(0);
                s.g(obj, "get(...)");
                c cVar2 = (c) obj;
                upgradeActivity.hasChosenDefault = true;
                Iterator it = upgradeActivity.productDisplayInfoList.iterator();
                s.g(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    s.g(next, "next(...)");
                    c cVar3 = (c) next;
                    if (cVar3.g() > 0 || cVar2.g() <= 0) {
                        if ((cVar3.g() > 0 && cVar2.g() <= 0) || cVar3.e() * ((long) cVar2.a()) < cVar2.e() * ((long) cVar3.a())) {
                            cVar2 = cVar3;
                        }
                    }
                }
                int iIndexOf = upgradeActivity.productDisplayInfoList.indexOf(cVar2);
                wp.a.a("Chosen product: " + cVar2.f() + ", position: " + iIndexOf, new Object[0]);
                y yVar4 = upgradeActivity.upgradeProductAdapter;
                if (yVar4 == null) {
                    s.w("upgradeProductAdapter");
                    yVar4 = null;
                }
                yVar4.m(iIndexOf);
                y yVar5 = upgradeActivity.upgradeProductAdapter;
                if (yVar5 == null) {
                    s.w("upgradeProductAdapter");
                } else {
                    yVar2 = yVar5;
                }
                yVar2.notifyItemChanged(iIndexOf);
            }
        }
        if (s.c(cVar.d(), upgradeActivity.anchorProduct)) {
            upgradeActivity.anchorPrice = cVar.e();
        }
        if (s.c(cVar.h(), "inapp") && cVar.e() > upgradeActivity.maxShownOneTimePrice) {
            upgradeActivity.maxShownOneTimePrice = cVar.e();
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1() {
        qf.j jVar = this.billingDataSource;
        qf.j jVar2 = null;
        if (jVar == null) {
            s.w("billingDataSource");
            jVar = null;
        }
        this.shownProducts = jVar.C();
        this.anchorProduct = W0().h(R.string.pref_anchor_product, "");
        this.upgradeProductRv = (RecyclerView) findViewById(R.id.subs_rv);
        if (s.c(this.upgradeProductLayout, "vertical")) {
            RecyclerView recyclerView = this.upgradeProductRv;
            if (recyclerView == null) {
                s.w("upgradeProductRv");
                recyclerView = null;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        } else {
            RecyclerView recyclerView2 = this.upgradeProductRv;
            if (recyclerView2 == null) {
                s.w("upgradeProductRv");
                recyclerView2 = null;
            }
            recyclerView2.setLayoutManager(new GridLayoutManager() { // from class: com.hecorat.screenrecorder.free.activities.UpgradeActivity$showProducts$1
                {
                    super((Context) this.f22727n, 1, 0, false);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.q
                public boolean checkLayoutParams(RecyclerView.r lp2) {
                    s.h(lp2, "lp");
                    int width = getWidth();
                    List list = this.f22727n.shownProducts;
                    if (list == null) {
                        s.w("shownProducts");
                        list = null;
                    }
                    ((ViewGroup.MarginLayoutParams) lp2).width = width / list.size();
                    return true;
                }
            });
        }
        this.upgradeProductAdapter = new y(this.productDisplayInfoList, s.c(this.upgradeProductLayout, "vertical"));
        RecyclerView recyclerView3 = this.upgradeProductRv;
        if (recyclerView3 == null) {
            s.w("upgradeProductRv");
            recyclerView3 = null;
        }
        y yVar = this.upgradeProductAdapter;
        if (yVar == null) {
            s.w("upgradeProductAdapter");
            yVar = null;
        }
        recyclerView3.setAdapter(yVar);
        y yVar2 = this.upgradeProductAdapter;
        if (yVar2 == null) {
            s.w("upgradeProductAdapter");
            yVar2 = null;
        }
        yVar2.p(new Function1() { // from class: ff.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpgradeActivity.k1(this.f38570a, (String) obj);
            }
        });
        View viewFindViewById = findViewById(R.id.btn_buy);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: ff.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpgradeActivity.l1(this.f38577a, view);
            }
        });
        y yVar3 = this.upgradeProductAdapter;
        if (yVar3 == null) {
            s.w("upgradeProductAdapter");
            yVar3 = null;
        }
        s.e(viewFindViewById);
        yVar3.n(viewFindViewById);
        List list = this.shownProducts;
        if (list == null) {
            s.w("shownProducts");
            list = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h1((String) it.next());
        }
        String strH = W0().h(R.string.pref_current_promo_product, "");
        this.promoProduct = strH;
        if (strH.length() > 0) {
            qf.j jVar3 = this.billingDataSource;
            if (jVar3 == null) {
                s.w("billingDataSource");
                jVar3 = null;
            }
            if (jVar3.F(this.promoProduct)) {
                n1(this.promoProduct);
            }
        }
        qf.j jVar4 = this.billingDataSource;
        if (jVar4 == null) {
            s.w("billingDataSource");
        } else {
            jVar2 = jVar4;
        }
        jVar2.K().j(this, new g(new Function1() { // from class: ff.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UpgradeActivity.m1(this.f38581a, (List) obj);
            }
        }));
    }

    public static final g0 k1(UpgradeActivity upgradeActivity, String productId) {
        s.h(productId, "productId");
        upgradeActivity.X0("select_product", productId);
        return g0.f38750a;
    }

    public static final void l1(UpgradeActivity upgradeActivity, View view) {
        y yVar = upgradeActivity.upgradeProductAdapter;
        y yVar2 = null;
        if (yVar == null) {
            s.w("upgradeProductAdapter");
            yVar = null;
        }
        if (yVar.getItemCount() > 0) {
            qf.j jVar = upgradeActivity.billingDataSource;
            if (jVar == null) {
                s.w("billingDataSource");
                jVar = null;
            }
            if (s.c(jVar.w().f(), Boolean.TRUE)) {
                return;
            }
            y yVar3 = upgradeActivity.upgradeProductAdapter;
            if (yVar3 == null) {
                s.w("upgradeProductAdapter");
            } else {
                yVar2 = yVar3;
            }
            String strD = yVar2.h().d();
            upgradeActivity.X0("buy_click", strD);
            P0(upgradeActivity, upgradeActivity, strD, null, 4, null);
        }
    }

    public static final g0 m1(UpgradeActivity upgradeActivity, List list) {
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            j0.b(upgradeActivity, R.string.toast_thanks_for_upgrading);
            upgradeActivity.g1(list);
            int intExtra = upgradeActivity.getIntent().getIntExtra("key_extra_data", -1);
            wp.a.a("Extra data: " + intExtra, new Object[0]);
            if (intExtra == -1) {
                upgradeActivity.setResult(-1);
            } else {
                new Intent().putExtra("key_extra_data", intExtra);
                upgradeActivity.setResult(-1, upgradeActivity.getIntent());
            }
            upgradeActivity.finish();
        }
        return g0.f38750a;
    }

    private final void n1(String productId) {
        qf.j jVar = this.billingDataSource;
        if (jVar == null) {
            s.w("billingDataSource");
            jVar = null;
        }
        k0 k0VarB = jVar.B(productId);
        if (k0VarB != null) {
            k0VarB.j(this, new g(new Function1() { // from class: ff.x1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpgradeActivity.o1(this.f38584a, (UpgradeActivity.c) obj);
                }
            }));
        }
    }

    public static final g0 o1(UpgradeActivity upgradeActivity, c cVar) {
        upgradeActivity.promoFormatPrice = cVar.c();
        upgradeActivity.promoPrice = cVar.e();
        upgradeActivity.priceByProduct.put(cVar.d(), w.a(Long.valueOf(cVar.e()), cVar.b().getCurrencyCode()));
        return g0.f38750a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O0(Activity activity, String productId, final Function1 onLaunchResult) {
        s.h(activity, "activity");
        s.h(productId, "productId");
        qf.j jVar = null;
        qf.j jVar2 = null;
        qf.j.b bVar = onLaunchResult != null ? new qf.j.b() { // from class: ff.o1
            @Override // qf.j.b
            public final void a(boolean z10) {
                UpgradeActivity.Q0(onLaunchResult, z10);
            }
        } : null;
        Set<String> stringSet = W0().g().getStringSet(getString(R.string.pref_bought_products), Collections.EMPTY_SET);
        if (stringSet == null || stringSet.isEmpty()) {
            qf.j jVar3 = this.billingDataSource;
            if (jVar3 == null) {
                s.w("billingDataSource");
            } else {
                jVar = jVar3;
            }
            jVar.H(activity, productId, bVar, new String[0]);
            return;
        }
        qf.j jVar4 = this.billingDataSource;
        if (jVar4 == null) {
            s.w("billingDataSource");
        } else {
            jVar2 = jVar4;
        }
        jVar2.H(activity, productId, bVar, r.a0(stringSet));
    }

    public final boolean R0() {
        qf.j jVar = this.billingDataSource;
        if (jVar == null) {
            return false;
        }
        if (jVar == null) {
            s.w("billingDataSource");
            jVar = null;
        }
        return !s.c(jVar.w().f(), Boolean.TRUE);
    }

    public final FirebaseAnalytics V0() {
        FirebaseAnalytics firebaseAnalytics = this.mFirebaseAnalytics;
        if (firebaseAnalytics != null) {
            return firebaseAnalytics;
        }
        s.w("mFirebaseAnalytics");
        return null;
    }

    public final lg.a W0() {
        lg.a aVar = this.mPreferenceManager;
        if (aVar != null) {
            return aVar;
        }
        s.w("mPreferenceManager");
        return null;
    }

    public final void X0(String action, String productId) {
        String stringExtra;
        s.h(action, "action");
        Bundle bundle = new Bundle();
        bundle.putString("action", action);
        if (productId != null) {
            bundle.putString("product_id", productId);
        }
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("action_source")) != null) {
            bundle.putString("action_source", stringExtra);
        }
        V0().a("upgrade_funnel", bundle);
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AzRecorderApp.d().b(this);
        this.upgradeProductLayout = T0();
        setContentView(R.layout.activity_upgrade_immersive);
        ((TextView) findViewById(R.id.restore_btn)).setOnClickListener(new View.OnClickListener() { // from class: ff.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpgradeActivity.Z0(this.f38554a, view);
            }
        });
        if (nh.b.p(this)) {
            ((ImageView) findViewById(R.id.background_image)).setImageDrawable(d0.h.e(getResources(), R.drawable.bg_upgrade_immersive_square, null));
        }
        ((TextView) findViewById(R.id.tv_link_privacy)).setOnClickListener(new View.OnClickListener() { // from class: ff.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpgradeActivity.a1(this.f38557a, view);
            }
        });
        ((TextView) findViewById(R.id.tv_link_tos)).setOnClickListener(new View.OnClickListener() { // from class: ff.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpgradeActivity.b1(this.f38560a, view);
            }
        });
        if (Build.VERSION.SDK_INT >= 29) {
            ((TextView) findViewById(R.id.tv_term)).setJustificationMode(1);
        }
        this.loadingPb = (ProgressBar) findViewById(R.id.pb_loading);
        if (savedInstanceState == null) {
            Y0(this, "paywall_view", null, 2, null);
        }
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.benefit_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List listQ = r.q(new a(R.drawable.ic_vip_im_ad_free, R.string.no_ads, false, 4, null), new a(R.drawable.ic_vip_im_live, R.string.live_stream, false, 4, null), new a(R.drawable.ic_vip_im_no_watermark, R.string.no_watermark, false, 4, null), new a(R.drawable.ic_vip_im_highest_quality, R.string.highest_quality, false, 4, null), new a(R.drawable.ic_vip_im_popup, R.string.hide_popup, false, 4, null), new a(R.drawable.ic_vip_im_caption, R.string.auto_caption, false, 4, null), new a(R.drawable.ic_vip_im_compression, R.string.video_compression, false, 4, null), new a(R.drawable.ic_vip_im_more_features, R.string.more_features, false, 4, null));
        listQ.add(0, new a(R.drawable.ic_vip_im_record_screen, R.string.record_screen, true));
        recyclerView.setAdapter(new kf.g(listQ, R.layout.list_item_benefit_immersive));
        ImageView imageView = (ImageView) findViewById(R.id.double_down_arrow);
        recyclerView.n(new d(recyclerView, imageView));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ff.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpgradeActivity.c1(recyclerView, view);
            }
        });
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.8f, 1.0f);
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.setRepeatCount(5);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setStartDelay(1000L);
        objectAnimatorOfFloat.start();
        ((ImageButton) findViewById(R.id.close_btn)).setOnClickListener(new View.OnClickListener() { // from class: ff.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpgradeActivity.d1(this.f38567a, view);
            }
        });
        TextView textView = (TextView) findViewById(R.id.free_tv);
        l0 l0Var = l0.f47742a;
        String string = getString(R.string.free);
        s.g(string, "getString(...)");
        textView.setText(l0Var.a(string));
        TextView textView2 = (TextView) findViewById(R.id.pro_tv);
        String string2 = getString(R.string.pro);
        s.g(string2, "getString(...)");
        textView2.setText(l0Var.a(string2));
        Window window = getWindow();
        s.g(window, "getWindow(...)");
        l0Var.C(window);
        e eVar = new e();
        this.billingReadyRunnable = eVar;
        this.billingWaitHandler.post(eVar);
        getOnBackPressedDispatcher().g(this, new f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        qf.j jVar = this.billingDataSource;
        Runnable runnable = null;
        if (jVar != null) {
            if (jVar == null) {
                s.w("billingDataSource");
                jVar = null;
            }
            jVar.K().p(this);
            List<String> list = this.shownProducts;
            if (list == null) {
                s.w("shownProducts");
                list = null;
            }
            for (String str : list) {
                qf.j jVar2 = this.billingDataSource;
                if (jVar2 == null) {
                    s.w("billingDataSource");
                    jVar2 = null;
                }
                jVar2.B(str).p(this);
            }
        }
        Handler handler = this.billingWaitHandler;
        Runnable runnable2 = this.billingReadyRunnable;
        if (runnable2 == null) {
            s.w("billingReadyRunnable");
        } else {
            runnable = runnable2;
        }
        handler.removeCallbacks(runnable);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        s.h(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            finish();
        } else if (itemId == R.id.action_already_vip) {
            e1();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            l0 l0Var = l0.f47742a;
            Window window = getWindow();
            s.g(window, "getWindow(...)");
            l0Var.C(window);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22710c;

        public a(int i10, int i11, boolean z10) {
            this.f22708a = i10;
            this.f22709b = i11;
            this.f22710c = z10;
        }

        public final int a() {
            return this.f22708a;
        }

        public final int b() {
            return this.f22709b;
        }

        public final boolean c() {
            return this.f22710c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22708a == aVar.f22708a && this.f22709b == aVar.f22709b && this.f22710c == aVar.f22710c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f22708a) * 31) + Integer.hashCode(this.f22709b)) * 31) + Boolean.hashCode(this.f22710c);
        }

        public String toString() {
            return "BenefitInfo(ivId=" + this.f22708a + ", tvId=" + this.f22709b + ", isFree=" + this.f22710c + ')';
        }

        public /* synthetic */ a(int i10, int i11, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, (i12 & 4) != 0 ? false : z10);
        }
    }
}
