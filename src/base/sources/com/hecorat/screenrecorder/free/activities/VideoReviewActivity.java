package com.hecorat.screenrecorder.free.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.q0;
import com.bumptech.glide.load.engine.GlideException;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.VideoReviewActivity;
import com.hecorat.screenrecorder.free.videoeditor.EditVideoActivity;
import ff.v0;
import java.util.ArrayList;
import java.util.Collections;
import lf.n;
import lg.x;
import nh.f0;
import nh.j0;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class VideoReviewActivity extends v0 implements View.OnClickListener, f0.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public dg.l f22756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public lg.a f22757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f22758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f22759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f22760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i6.e f22761k = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a implements i6.e {
        public a() {
        }

        @Override // i6.e
        public boolean a(GlideException glideException, Object obj, j6.i iVar, boolean z10) {
            return false;
        }

        @Override // i6.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(Drawable drawable, Object obj, j6.i iVar, r5.a aVar, boolean z10) {
            int iD = VideoReviewActivity.this.f22757g.d(R.string.pref_number_of_recordings, 0) + 1;
            VideoReviewActivity.this.f22757g.k(R.string.pref_number_of_recordings, iD);
            boolean z11 = !VideoReviewActivity.this.f22757g.b(R.string.pref_clicked_ok_ask_for_review, false) && l0.n(iD);
            ef.a.q(z11);
            if (z11) {
                VideoReviewActivity.this.getWindow().addFlags(32);
                VideoReviewActivity.this.getWindow().addFlags(MediaHttpUploader.MINIMUM_CHUNK_SIZE);
            }
            wp.a.a("Should ask review %s", Boolean.valueOf(z11));
            return false;
        }
    }

    public static /* synthetic */ void C0(VideoReviewActivity videoReviewActivity, String str, View view) {
        videoReviewActivity.f22758h.p(str);
        view.setVisibility(8);
    }

    public static /* synthetic */ void D0(final VideoReviewActivity videoReviewActivity, Integer num) {
        videoReviewActivity.getClass();
        if (num.intValue() != 2 || videoReviewActivity.f22756f.T() == null) {
            if (num.intValue() == 1) {
                l0.x(videoReviewActivity);
                videoReviewActivity.finish();
                return;
            }
            return;
        }
        videoReviewActivity.f22759i = videoReviewActivity.f22756f.T();
        ((com.bumptech.glide.k) com.bumptech.glide.c.C(videoReviewActivity).r(videoReviewActivity.f22759i).C0(videoReviewActivity.f22761k).e()).A0((ImageView) videoReviewActivity.findViewById(R.id.iv_thumb));
        videoReviewActivity.findViewById(R.id.pb_saving).setVisibility(8);
        videoReviewActivity.findViewById(R.id.iv_play).setVisibility(0);
        videoReviewActivity.findViewById(R.id.ll_action).setVisibility(0);
        ((TextView) videoReviewActivity.findViewById(R.id.tv_review_title)).setText(R.string.toast_video_saved);
        final String strS = videoReviewActivity.f22756f.S();
        final String strG = videoReviewActivity.f22758h.g(strS);
        final View viewFindViewById = videoReviewActivity.findViewById(R.id.no_sound_banner);
        TextView textView = (TextView) videoReviewActivity.findViewById(R.id.tv_no_sound_banner_text);
        if (strG != null && viewFindViewById != null && textView != null) {
            textView.setText("call_partial".equals(strG) ? R.string.no_sound_hint_call : R.string.no_sound_hint);
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: ff.f2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoReviewActivity videoReviewActivity2 = this.f38519a;
                    lg.l.c(videoReviewActivity2, videoReviewActivity2.f22757g, strG, new Runnable() { // from class: ff.g2
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoReviewActivity.C0(videoReviewActivity2, str, view);
                        }
                    });
                }
            });
        }
        videoReviewActivity.findViewById(R.id.fm_view_result).setOnClickListener(videoReviewActivity);
        videoReviewActivity.findViewById(R.id.iv_share).setOnClickListener(videoReviewActivity);
        View viewFindViewById2 = videoReviewActivity.findViewById(R.id.iv_delete);
        videoReviewActivity.f22760j = viewFindViewById2;
        viewFindViewById2.setOnClickListener(videoReviewActivity);
        videoReviewActivity.findViewById(R.id.iv_edit).setOnClickListener(videoReviewActivity);
    }

    private void E0() {
        l0.s(this, this.f22757g);
    }

    private void F0() {
        Intent intent = new Intent(this, (Class<?>) EditVideoActivity.class);
        intent.addFlags(268435456);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(this.f22759i);
        intent.putParcelableArrayListExtra("video_uri_list_key", arrayList);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2022) {
            t(i11 == -1);
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onBackPressed() {
        E0();
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.fm_view_result) {
            f0.D(this, this.f22759i, 1);
            finish();
            return;
        }
        if (id2 == R.id.iv_share) {
            f0.K(this, this.f22759i, "video/*");
            return;
        }
        if (id2 == R.id.iv_delete) {
            if (Build.VERSION.SDK_INT >= 30) {
                f0.p(this, this.f22759i, this, 2022);
                return;
            } else {
                f0.l(this, Collections.singletonList(this.f22759i), this, 2022);
                return;
            }
        }
        if (id2 == R.id.iv_edit) {
            F0();
            finish();
        } else if (id2 == R.id.iv_close) {
            E0();
            finish();
        }
    }

    @Override // ff.v0, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        AzRecorderApp.d().t(this);
        setContentView(R.layout.activity_video_review);
        super.onCreate(bundle);
        findViewById(R.id.iv_close).setOnClickListener(this);
        this.f22756f.U().j(this, new q0() { // from class: ff.e2
            @Override // androidx.lifecycle.q0
            public final void d(Object obj) {
                VideoReviewActivity.D0(this.f38516a, (Integer) obj);
            }
        });
        n.i(n.a.REMOVE_WATERMARK).m();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f22756f.h0();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            E0();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // nh.f0.b
    public void t(boolean z10) {
        if (!z10) {
            j0.b(this, R.string.toast_video_was_not_deleted);
            return;
        }
        l0.A(this, "grant_permission_storage");
        j0.b(this, f0.N(this) ? R.string.toast_video_have_been_moved_to_trash : R.string.toast_video_have_been_deleted);
        finish();
    }
}
