package com.hecorat.screenrecorder.free.videoeditor;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.p0;
import androidx.lifecycle.s1;
import com.hecorat.screenrecorder.free.helpers.webserver.ga.CnrFvGiAIjOOU;
import com.hecorat.screenrecorder.free.videoeditor.EditVideoActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import lf.n;
import nh.l0;
import oh.s2;
import oh.t0;
import uh.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0006*\u0001\"\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/EditVideoActivity;", "Loh/t0;", "Llf/n$c;", "<init>", "()V", "Lfl/g0;", "G0", "Ltf/g;", "binding", "D0", "(Ltf/g;)V", "H0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "h", "f", "onDestroy", "Llf/n;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Llf/n;", "rewardedAdsManager", "Luh/y;", "e", "Luh/y;", "viewModel", "Llg/a;", "Llg/a;", "C0", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "com/hecorat/screenrecorder/free/videoeditor/EditVideoActivity$b", "g", "Lcom/hecorat/screenrecorder/free/videoeditor/EditVideoActivity$b;", "permissionCallback", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EditVideoActivity extends t0 implements n.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public n rewardedAdsManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public y viewModel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final b permissionCallback = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements vh.h {
        public b() {
        }

        @Override // vh.h
        public void a(List permissions, boolean z10) {
            s.h(permissions, "permissions");
            EditVideoActivity.this.finish();
        }

        @Override // vh.h
        public void b(List permissions, boolean z10) throws IOException {
            s.h(permissions, "permissions");
            if (z10) {
                EditVideoActivity.this.G0();
            }
        }
    }

    private final void D0(tf.g binding) {
        Toolbar toolbar = binding.E;
        s.g(toolbar, "toolbar");
        y0(toolbar);
        binding.F.setOnClickListener(new View.OnClickListener() { // from class: oh.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditVideoActivity.E0(this.f48888a, view);
            }
        });
        binding.D.setOnClickListener(new View.OnClickListener() { // from class: oh.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditVideoActivity.F0(this.f48901a, view);
            }
        });
    }

    public static final void E0(EditVideoActivity editVideoActivity, View view) {
        editVideoActivity.H0();
    }

    public static final void F0(EditVideoActivity editVideoActivity, View view) {
        y yVar = editVideoActivity.viewModel;
        if (yVar != null) {
            yVar.v1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0() throws IOException {
        Intent intent = getIntent();
        s.g(intent, "getIntent(...)");
        ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("video_uri_list_key", Uri.class) : intent.getParcelableArrayListExtra("video_uri_list_key");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            finish();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = parcelableArrayListExtra.iterator();
        s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            s.g(next, "next(...)");
            ng.d dVarW = sh.b.w(this, (Uri) next);
            if (dVarW != null) {
                arrayList.add(dVarW);
            }
        }
        if (arrayList.isEmpty()) {
            finish();
            return;
        }
        y yVar = (y) new s1(this).a(y.class);
        this.viewModel = yVar;
        if (yVar != null) {
            yVar.a2(arrayList);
        }
        y yVar2 = this.viewModel;
        if (yVar2 != null) {
            yVar2.b2(getIntent().getStringExtra("extra_caption_source"));
        }
        tf.g gVarY = tf.g.Y(LayoutInflater.from(this));
        s.g(gVarY, "inflate(...)");
        setContentView(gVarY.B());
        D0(gVarY);
        gVarY.a0(this.viewModel);
        gVarY.S(this);
        if (l0.o()) {
            return;
        }
        n nVarA = n.f44484g.a(n.a.REMOVE_WATERMARK);
        this.rewardedAdsManager = nVarA;
        if (nVarA != null) {
            nVarA.o(this);
        }
        n nVar = this.rewardedAdsManager;
        if (nVar != null) {
            nVar.m();
        }
    }

    private final void H0() {
        new s2().show(getSupportFragmentManager(), "outputSettings");
    }

    public final lg.a C0() {
        lg.a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        s.w("preferenceManager");
        return null;
    }

    @Override // lf.n.c
    public void f() {
    }

    @Override // lf.n.c
    public void h() {
        p0 p0VarQ1;
        y yVar = this.viewModel;
        if (yVar == null || (p0VarQ1 = yVar.q1()) == null) {
            return;
        }
        p0VarQ1.q(Boolean.TRUE);
    }

    @Override // oh.t0, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        CnrFvGiAIjOOU.uIxmgHDH.invoke(null, this, savedInstanceState);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() throws IllegalAccessException, InvocationTargetException {
        CnrFvGiAIjOOU.qfYb.invoke(null, this);
    }
}
