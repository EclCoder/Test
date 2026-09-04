package com.hecorat.screenrecorder.free.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.core.content.a;
import bm.r;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.feedback.AskQualityActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import tf.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/hecorat/screenrecorder/free/feedback/AskQualityActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Ltf/e;", "c", "Ltf/e;", "binding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AskQualityActivity extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private e binding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(AskQualityActivity askQualityActivity, View view) {
        askQualityActivity.startActivity(new Intent(askQualityActivity, (Class<?>) FeedbackActivity.class));
        askQualityActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(AskQualityActivity askQualityActivity, View view) {
        askQualityActivity.startActivity(new Intent(askQualityActivity, (Class<?>) RateActivity.class));
        askQualityActivity.finish();
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        e eVarY = e.Y(getLayoutInflater());
        this.binding = eVarY;
        e eVar = null;
        if (eVarY == null) {
            s.w("binding");
            eVarY = null;
        }
        setContentView(eVarY.B());
        setFinishOnTouchOutside(true);
        int intExtra = getIntent().getIntExtra("number_of_recordings", 1);
        String string = intExtra == 1 ? getString(R.string.created_1_video, getString(R.string.az_recorder)) : getString(R.string.created_3_videos, getString(R.string.az_recorder));
        s.e(string);
        int iF0 = r.f0(string, String.valueOf(intExtra), 0, false, 6, null);
        if (iF0 == -1) {
            e eVar2 = this.binding;
            if (eVar2 == null) {
                s.w("binding");
                eVar2 = null;
            }
            eVar2.E.setText(string);
        } else {
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(a.getColor(this, R.color.sunset_orange)), iF0, iF0 + 1, 33);
            e eVar3 = this.binding;
            if (eVar3 == null) {
                s.w("binding");
                eVar3 = null;
            }
            eVar3.E.setText(spannableString);
        }
        e eVar4 = this.binding;
        if (eVar4 == null) {
            s.w("binding");
            eVar4 = null;
        }
        eVar4.C.setOnClickListener(new View.OnClickListener() { // from class: hg.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AskQualityActivity.z0(this.f40349a, view);
            }
        });
        e eVar5 = this.binding;
        if (eVar5 == null) {
            s.w("binding");
        } else {
            eVar = eVar5;
        }
        eVar.B.setOnClickListener(new View.OnClickListener() { // from class: hg.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AskQualityActivity.A0(this.f40350a, view);
            }
        });
    }
}
