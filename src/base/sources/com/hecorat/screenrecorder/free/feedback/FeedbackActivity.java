package com.hecorat.screenrecorder.free.feedback;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.chip.Chip;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.feedback.FeedbackActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import f.c;
import f.j;
import ff.b;
import fl.g0;
import g.d;
import hg.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import nh.j0;
import nh.l0;
import tf.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003JE\u0010\u0010\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/hecorat/screenrecorder/free/feedback/FeedbackActivity;", "Lff/b;", "<init>", "()V", "Lfl/g0;", "I0", "R0", "", "", "emailAddresses", "subject", TtmlNode.TAG_BODY, "Ljava/util/ArrayList;", "Landroid/net/Uri;", "Lkotlin/collections/ArrayList;", "attachments", "Q0", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ltf/m;", "c", "Ltf/m;", "binding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/util/ArrayList;", "imageUriList", "Lhg/e;", "e", "Lhg/e;", "imageAdapter", "Landroidx/recyclerview/widget/g;", "f", "Landroidx/recyclerview/widget/g;", "imageAndHeaderAdapter", "Lhg/g;", "g", "Lhg/g;", "imageHeaderAdapter", "", "h", "I", "editingImagePos", "Llg/a;", "i", "Llg/a;", "getPreferenceManager", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "Lf/c;", "Lf/i;", "j", "Lf/c;", "pickMedia", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeedbackActivity extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private m binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private e imageAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private g imageAndHeaderAdapter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private hg.g imageHeaderAdapter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ArrayList imageUriList = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int editingImagePos = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c pickMedia = registerForActivityResult(new d(), new f.b() { // from class: hg.n
        @Override // f.b
        public final void a(Object obj) {
            FeedbackActivity.P0(this.f40370a, (Uri) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0() {
        m mVar = this.binding;
        m mVar2 = null;
        if (mVar == null) {
            s.w("binding");
            mVar = null;
        }
        AppCompatButton appCompatButton = mVar.I;
        m mVar3 = this.binding;
        if (mVar3 == null) {
            s.w("binding");
        } else {
            mVar2 = mVar3;
        }
        Editable text = mVar2.F.getText();
        s.g(text, "getText(...)");
        appCompatButton.setEnabled(text.length() >= 10 || this.imageUriList.size() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(FeedbackActivity feedbackActivity, View view) {
        feedbackActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 K0(FeedbackActivity feedbackActivity, int i10) {
        feedbackActivity.imageUriList.remove(i10);
        e eVar = feedbackActivity.imageAdapter;
        hg.g gVar = null;
        if (eVar == null) {
            s.w("imageAdapter");
            eVar = null;
        }
        eVar.notifyDataSetChanged();
        if (feedbackActivity.imageUriList.size() == 2) {
            g gVar2 = feedbackActivity.imageAndHeaderAdapter;
            if (gVar2 == null) {
                s.w("imageAndHeaderAdapter");
                gVar2 = null;
            }
            hg.g gVar3 = feedbackActivity.imageHeaderAdapter;
            if (gVar3 == null) {
                s.w("imageHeaderAdapter");
            } else {
                gVar = gVar3;
            }
            gVar2.f(gVar);
        }
        feedbackActivity.I0();
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 L0(FeedbackActivity feedbackActivity, int i10) {
        wp.a.a("Onclick position %s", Integer.valueOf(i10));
        feedbackActivity.editingImagePos = i10;
        feedbackActivity.pickMedia.b(j.b(d.C0583d.f38826a, 0, false, null, 14, null));
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 M0(FeedbackActivity feedbackActivity) {
        feedbackActivity.editingImagePos = -1;
        feedbackActivity.pickMedia.b(j.b(d.C0583d.f38826a, 0, false, null, 14, null));
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(FeedbackActivity feedbackActivity, View view) {
        l0.t(feedbackActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(FeedbackActivity feedbackActivity, View view) {
        feedbackActivity.R0();
        feedbackActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(FeedbackActivity feedbackActivity, Uri uri) {
        if (uri != null) {
            int i10 = feedbackActivity.editingImagePos;
            e eVar = null;
            if (i10 == -1) {
                feedbackActivity.imageUriList.add(uri);
                if (feedbackActivity.imageUriList.size() >= 3) {
                    g gVar = feedbackActivity.imageAndHeaderAdapter;
                    if (gVar == null) {
                        s.w("imageAndHeaderAdapter");
                        gVar = null;
                    }
                    hg.g gVar2 = feedbackActivity.imageHeaderAdapter;
                    if (gVar2 == null) {
                        s.w("imageHeaderAdapter");
                        gVar2 = null;
                    }
                    gVar.h(gVar2);
                }
                feedbackActivity.I0();
            } else {
                feedbackActivity.imageUriList.set(i10, uri);
            }
            e eVar2 = feedbackActivity.imageAdapter;
            if (eVar2 == null) {
                s.w("imageAdapter");
            } else {
                eVar = eVar2;
            }
            eVar.notifyDataSetChanged();
        }
    }

    private final void Q0(String[] emailAddresses, String subject, String body, ArrayList attachments) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        Intent intent2 = new Intent("android.intent.action.SEND_MULTIPLE");
        intent2.putExtra("android.intent.extra.EMAIL", emailAddresses);
        intent2.putExtra("android.intent.extra.SUBJECT", subject);
        intent2.putExtra("android.intent.extra.TEXT", body);
        intent2.addFlags(1);
        intent2.putExtra("android.intent.extra.STREAM", attachments);
        intent2.setSelector(intent);
        try {
            startActivity(intent2);
        } catch (Exception e10) {
            wp.a.e(e10);
            j0.b(this, R.string.toast_install_mail_app_to_send_feedback);
        }
    }

    private final void R0() {
        String strH = l0.f47742a.h();
        m mVar = this.binding;
        m mVar2 = null;
        if (mVar == null) {
            s.w("binding");
            mVar = null;
        }
        wp.a.a("Checked chip ids: %s", Integer.valueOf(mVar.J.getCheckedChipIds().size()));
        m mVar3 = this.binding;
        if (mVar3 == null) {
            s.w("binding");
            mVar3 = null;
        }
        for (Integer num : mVar3.J.getCheckedChipIds()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strH);
            sb2.append('[');
            m mVar4 = this.binding;
            if (mVar4 == null) {
                s.w("binding");
                mVar4 = null;
            }
            View viewB = mVar4.B();
            s.e(num);
            View viewFindViewById = viewB.findViewById(num.intValue());
            s.f(viewFindViewById, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            sb2.append((Object) ((Chip) viewFindViewById).getText());
            sb2.append(']');
            strH = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strH + '\n');
        m mVar5 = this.binding;
        if (mVar5 == null) {
            s.w("binding");
        } else {
            mVar2 = mVar5;
        }
        sb3.append((Object) mVar2.F.getText());
        String string = sb3.toString();
        String string2 = getString(R.string.feedback_hint);
        s.g(string2, "getString(...)");
        Q0(new String[]{"az.screen.recorder@gmail.com"}, string2, string, this.imageUriList);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent event) {
        s.h(event, "event");
        if (event.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof EditText) {
                Rect rect = new Rect();
                EditText editText = (EditText) currentFocus;
                editText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) event.getRawX(), (int) event.getRawY())) {
                    editText.clearFocus();
                    Object systemService = getSystemService("input_method");
                    s.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        AzRecorderApp.d().i(this);
        super.onCreate(savedInstanceState);
        nh.b.b(this);
        m mVarY = m.Y(getLayoutInflater());
        this.binding = mVarY;
        m mVar = null;
        if (mVarY == null) {
            s.w("binding");
            mVarY = null;
        }
        setContentView(mVarY.B());
        m mVar2 = this.binding;
        if (mVar2 == null) {
            s.w("binding");
            mVar2 = null;
        }
        View viewB = mVar2.B();
        s.g(viewB, "getRoot(...)");
        y0(viewB);
        m mVar3 = this.binding;
        if (mVar3 == null) {
            s.w("binding");
            mVar3 = null;
        }
        u0(mVar3.K);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
        }
        androidx.appcompat.app.a aVarL1 = l0();
        if (aVarL1 != null) {
            aVarL1.D(getString(R.string.feedback_and_suggestion));
        }
        m mVar4 = this.binding;
        if (mVar4 == null) {
            s.w("binding");
            mVar4 = null;
        }
        mVar4.K.setNavigationOnClickListener(new View.OnClickListener() { // from class: hg.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackActivity.J0(this.f40364a, view);
            }
        });
        m mVar5 = this.binding;
        if (mVar5 == null) {
            s.w("binding");
            mVar5 = null;
        }
        mVar5.H.setText(getString(R.string.join_az_recorder_community, getString(R.string.az_recorder)));
        this.imageAdapter = new e(this.imageUriList, new Function1() { // from class: hg.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedbackActivity.K0(this.f40365a, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: hg.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeedbackActivity.L0(this.f40366a, ((Integer) obj).intValue());
            }
        });
        this.imageHeaderAdapter = new hg.g(new tl.a() { // from class: hg.k
            @Override // tl.a
            public final Object invoke() {
                return FeedbackActivity.M0(this.f40367a);
            }
        });
        e eVar = this.imageAdapter;
        if (eVar == null) {
            s.w("imageAdapter");
            eVar = null;
        }
        hg.g gVar = this.imageHeaderAdapter;
        if (gVar == null) {
            s.w("imageHeaderAdapter");
            gVar = null;
        }
        this.imageAndHeaderAdapter = new g(eVar, gVar);
        m mVar6 = this.binding;
        if (mVar6 == null) {
            s.w("binding");
            mVar6 = null;
        }
        RecyclerView recyclerView = mVar6.C;
        g gVar2 = this.imageAndHeaderAdapter;
        if (gVar2 == null) {
            s.w("imageAndHeaderAdapter");
            gVar2 = null;
        }
        recyclerView.setAdapter(gVar2);
        m mVar7 = this.binding;
        if (mVar7 == null) {
            s.w("binding");
            mVar7 = null;
        }
        mVar7.E.setOnClickListener(new View.OnClickListener() { // from class: hg.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackActivity.N0(this.f40368a, view);
            }
        });
        m mVar8 = this.binding;
        if (mVar8 == null) {
            s.w("binding");
            mVar8 = null;
        }
        EditText feedbackEdt = mVar8.F;
        s.g(feedbackEdt, "feedbackEdt");
        feedbackEdt.addTextChangedListener(new a());
        m mVar9 = this.binding;
        if (mVar9 == null) {
            s.w("binding");
        } else {
            mVar = mVar9;
        }
        mVar.I.setOnClickListener(new View.OnClickListener() { // from class: hg.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackActivity.O0(this.f40369a, view);
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            FeedbackActivity.this.I0();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
