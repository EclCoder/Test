package com.hecorat.screenrecorder.free.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.feedback.RateActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import lg.a;
import nh.l0;
import tf.e2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+¨\u0006/"}, d2 = {"Lcom/hecorat/screenrecorder/free/feedback/RateActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Lfl/g0;", "D0", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "c", "I", "currentRating", "Ljava/util/ArrayList;", "Landroid/widget/ImageView;", "Lkotlin/collections/ArrayList;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/util/ArrayList;", "starArray", "Llg/a;", "e", "Llg/a;", "B0", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "f", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "A0", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "firebaseAnalytics", "Ltf/e2;", "g", "Ltf/e2;", "binding", "Landroid/view/View$OnClickListener;", "h", "Landroid/view/View$OnClickListener;", "buttonClickListener", "i", "starClickListener", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RateActivity extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int currentRating;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public a preferenceManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public FirebaseAnalytics firebaseAnalytics;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private e2 binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ArrayList starArray = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final View.OnClickListener buttonClickListener = new View.OnClickListener() { // from class: hg.p
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RateActivity.z0(this.f40371a, view);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final View.OnClickListener starClickListener = new View.OnClickListener() { // from class: hg.q
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RateActivity.E0(this.f40372a, view);
        }
    };

    private final void C0() {
        l0.r(this, "market://details?id=com.hecorat.screenrecorder.free", "https://play.google.com/store/apps/details?id=com.hecorat.screenrecorder.free");
        B0().j(R.string.pref_clicked_ok_ask_for_review, true);
    }

    private final void D0() {
        B0().k(R.string.pref_internal_app_rating, this.currentRating);
        Bundle bundle = new Bundle();
        bundle.putString("satisfaction", this.currentRating + " stars");
        bundle.putInt(CampaignEx.JSON_KEY_STAR, this.currentRating);
        A0().a("rate_app_internally", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(RateActivity rateActivity, View view) {
        String string;
        int i10;
        e2 e2Var = null;
        Object tag = view != null ? view.getTag() : null;
        s.f(tag, "null cannot be cast to non-null type kotlin.String");
        rateActivity.currentRating = Integer.parseInt((String) tag);
        Iterator it = rateActivity.starArray.iterator();
        s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            s.g(next, "next(...)");
            ImageView imageView = (ImageView) next;
            Object tag2 = imageView.getTag();
            s.f(tag2, "null cannot be cast to non-null type kotlin.String");
            if (Integer.parseInt((String) tag2) <= rateActivity.currentRating) {
                imageView.setImageResource(R.drawable.ic_star_filled);
            } else {
                imageView.setImageResource(R.drawable.ic_star_not_filled);
            }
        }
        if (rateActivity.currentRating == 5) {
            e2 e2Var2 = rateActivity.binding;
            if (e2Var2 == null) {
                s.w("binding");
                e2Var2 = null;
            }
            e2Var2.B.setVisibility(8);
            e2 e2Var3 = rateActivity.binding;
            if (e2Var3 == null) {
                s.w("binding");
                e2Var3 = null;
            }
            e2Var3.C.setVisibility(0);
        } else {
            e2 e2Var4 = rateActivity.binding;
            if (e2Var4 == null) {
                s.w("binding");
                e2Var4 = null;
            }
            e2Var4.B.setVisibility(0);
            e2 e2Var5 = rateActivity.binding;
            if (e2Var5 == null) {
                s.w("binding");
                e2Var5 = null;
            }
            e2Var5.B.setEnabled(true);
            e2 e2Var6 = rateActivity.binding;
            if (e2Var6 == null) {
                s.w("binding");
                e2Var6 = null;
            }
            e2Var6.C.setVisibility(8);
        }
        e2 e2Var7 = rateActivity.binding;
        if (e2Var7 == null) {
            s.w("binding");
            e2Var7 = null;
        }
        TextView textView = e2Var7.E;
        e2 e2Var8 = rateActivity.binding;
        if (e2Var8 == null) {
            s.w("binding");
            e2Var8 = null;
        }
        textView.setTypeface(e2Var8.E.getTypeface(), 1);
        int dimensionPixelSize = rateActivity.getResources().getDimensionPixelSize(R.dimen.rate_icon_padding);
        e2 e2Var9 = rateActivity.binding;
        if (e2Var9 == null) {
            s.w("binding");
            e2Var9 = null;
        }
        ImageView emotionIv = e2Var9.A;
        s.g(emotionIv, "emotionIv");
        emotionIv.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        int i11 = rateActivity.currentRating;
        if (i11 == 4) {
            e2 e2Var10 = rateActivity.binding;
            if (e2Var10 == null) {
                s.w("binding");
                e2Var10 = null;
            }
            e2Var10.E.setText(rateActivity.getString(R.string.good));
            e2 e2Var11 = rateActivity.binding;
            if (e2Var11 == null) {
                s.w("binding");
                e2Var11 = null;
            }
            e2Var11.D.setText(rateActivity.getString(R.string.how_to_get_5_stars));
            e2 e2Var12 = rateActivity.binding;
            if (e2Var12 == null) {
                s.w("binding");
            } else {
                e2Var = e2Var12;
            }
            e2Var.A.setImageResource(R.drawable.good_face);
            return;
        }
        if (i11 == 5) {
            e2 e2Var13 = rateActivity.binding;
            if (e2Var13 == null) {
                s.w("binding");
                e2Var13 = null;
            }
            e2Var13.E.setText(rateActivity.getString(R.string.we_love_you_too));
            e2 e2Var14 = rateActivity.binding;
            if (e2Var14 == null) {
                s.w("binding");
                e2Var14 = null;
            }
            e2Var14.D.setText(rateActivity.getString(R.string.rate_5_stars_on_google_play));
            e2 e2Var15 = rateActivity.binding;
            if (e2Var15 == null) {
                s.w("binding");
            } else {
                e2Var = e2Var15;
            }
            e2Var.A.setImageResource(R.drawable.happy_face);
            return;
        }
        e2 e2Var16 = rateActivity.binding;
        if (e2Var16 == null) {
            s.w("binding");
            e2Var16 = null;
        }
        e2Var16.D.setText(rateActivity.getString(R.string.need_feedback));
        e2 e2Var17 = rateActivity.binding;
        if (e2Var17 == null) {
            s.w("binding");
            e2Var17 = null;
        }
        TextView textView2 = e2Var17.E;
        int i12 = rateActivity.currentRating;
        if (i12 != 2) {
            string = i12 != 3 ? rateActivity.getString(R.string.horrible) : rateActivity.getString(R.string.average);
        } else {
            string = rateActivity.getString(R.string.bad);
        }
        textView2.setText(string);
        int i13 = rateActivity.currentRating;
        if (i13 != 2) {
            i10 = i13 != 3 ? R.drawable.angry_face : R.drawable.acceptable_face;
        } else {
            i10 = R.drawable.bad_face;
        }
        e2 e2Var18 = rateActivity.binding;
        if (e2Var18 == null) {
            s.w("binding");
        } else {
            e2Var = e2Var18;
        }
        e2Var.A.setImageResource(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(RateActivity rateActivity, View view) {
        rateActivity.D0();
        int id2 = view.getId();
        if (id2 == R.id.feedback_btn) {
            rateActivity.startActivity(new Intent(rateActivity, (Class<?>) FeedbackActivity.class));
        } else if (id2 == R.id.rate_btn) {
            rateActivity.C0();
        }
        rateActivity.finish();
    }

    public final FirebaseAnalytics A0() {
        FirebaseAnalytics firebaseAnalytics = this.firebaseAnalytics;
        if (firebaseAnalytics != null) {
            return firebaseAnalytics;
        }
        s.w("firebaseAnalytics");
        return null;
    }

    public final a B0() {
        a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        s.w("preferenceManager");
        return null;
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        AzRecorderApp.d().l(this);
        super.onCreate(savedInstanceState);
        setFinishOnTouchOutside(true);
        e2 e2Var = null;
        e2 e2VarY = e2.Y(getLayoutInflater(), null, false);
        this.binding = e2VarY;
        if (e2VarY == null) {
            s.w("binding");
            e2VarY = null;
        }
        setContentView(e2VarY.B());
        e2 e2Var2 = this.binding;
        if (e2Var2 == null) {
            s.w("binding");
            e2Var2 = null;
        }
        e2Var2.B.setOnClickListener(this.buttonClickListener);
        e2 e2Var3 = this.binding;
        if (e2Var3 == null) {
            s.w("binding");
            e2Var3 = null;
        }
        e2Var3.C.setOnClickListener(this.buttonClickListener);
        e2 e2Var4 = this.binding;
        if (e2Var4 == null) {
            s.w("binding");
            e2Var4 = null;
        }
        e2Var4.E.setText(getString(R.string.message_get_rating_top, getString(R.string.az_recorder)));
        e2 e2Var5 = this.binding;
        if (e2Var5 == null) {
            s.w("binding");
            e2Var5 = null;
        }
        e2Var5.D.setText(getString(R.string.message_get_rating_bottom));
        this.starArray.clear();
        ArrayList arrayList = this.starArray;
        e2 e2Var6 = this.binding;
        if (e2Var6 == null) {
            s.w("binding");
            e2Var6 = null;
        }
        arrayList.add(e2Var6.H);
        ArrayList arrayList2 = this.starArray;
        e2 e2Var7 = this.binding;
        if (e2Var7 == null) {
            s.w("binding");
            e2Var7 = null;
        }
        arrayList2.add(e2Var7.J);
        ArrayList arrayList3 = this.starArray;
        e2 e2Var8 = this.binding;
        if (e2Var8 == null) {
            s.w("binding");
            e2Var8 = null;
        }
        arrayList3.add(e2Var8.I);
        ArrayList arrayList4 = this.starArray;
        e2 e2Var9 = this.binding;
        if (e2Var9 == null) {
            s.w("binding");
            e2Var9 = null;
        }
        arrayList4.add(e2Var9.G);
        ArrayList arrayList5 = this.starArray;
        e2 e2Var10 = this.binding;
        if (e2Var10 == null) {
            s.w("binding");
        } else {
            e2Var = e2Var10;
        }
        arrayList5.add(e2Var.F);
        Iterator it = this.starArray.iterator();
        s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            s.g(next, "next(...)");
            ((ImageView) next).setOnClickListener(this.starClickListener);
        }
    }
}
