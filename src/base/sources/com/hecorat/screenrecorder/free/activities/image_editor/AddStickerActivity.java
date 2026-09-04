package com.hecorat.screenrecorder.free.activities.image_editor;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.d0;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.FilePickerActivity;
import com.hecorat.screenrecorder.free.activities.image_editor.AddStickerActivity;
import com.hecorat.screenrecorder.free.widget.StickerImageView;
import com.hecorat.screenrecorder.free.widget.StickerView;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import nh.e;
import nh.f0;
import nh.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class AddStickerActivity extends d implements View.OnClickListener, StickerView.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f22769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f22770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearLayout f22771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MenuItem f22772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Uri f22773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bitmap f22774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap f22775i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private StickerImageView f22777k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    lg.a f22779m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayList f22776j = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f22778l = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends d0 {
        a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.d0
        public void d() {
            if (AddStickerActivity.this.f22778l && AddStickerActivity.this.f22779m.b(R.string.pref_show_confirm_exit_editor, true)) {
                AddStickerActivity.this.J0();
            } else {
                AddStickerActivity.this.F0(null);
            }
        }
    }

    public static /* synthetic */ void A0(AddStickerActivity addStickerActivity, Uri uri) {
        addStickerActivity.K0(false);
        addStickerActivity.F0(uri);
    }

    private void E0(String str) {
        if (this.f22774h == null) {
            return;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            StickerImageView stickerImageView = new StickerImageView(this, (bitmapDecodeFile.getHeight() * 1.0f) / bitmapDecodeFile.getWidth());
            stickerImageView.setImageBitmap(bitmapDecodeFile);
            stickerImageView.setListener(this);
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.image_with_padding, (ViewGroup) null);
            ImageView imageView = (ImageView) linearLayout.findViewById(R.id.iv_thumb);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.width = nh.b.a(this, 30);
            layoutParams.height = nh.b.a(this, 30);
            imageView.setLayoutParams(layoutParams);
            imageView.setImageBitmap(bitmapDecodeFile);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: gf.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddStickerActivity.y0(this.f39130a, view);
                }
            });
            this.f22771e.addView(linearLayout);
            this.f22770d.addView(stickerImageView);
            this.f22776j.add(stickerImageView);
            L0(stickerImageView);
            this.f22778l = true;
            this.f22772f.setVisible(true);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    private void G0() {
        if (this.f22773g != null) {
            K0(true);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            final Handler handler = new Handler(Looper.getMainLooper());
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: gf.b
                @Override // java.lang.Runnable
                public final void run() {
                    AddStickerActivity addStickerActivity = this.f39131a;
                    f0.H(addStickerActivity, addStickerActivity.f22775i, true, new f0.e() { // from class: gf.c
                        @Override // nh.f0.e
                        public final void a(Uri uri) {
                            AddStickerActivity.x0(addStickerActivity, handler, uri);
                        }
                    });
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString("edit_action", "sticker");
            FirebaseAnalytics.getInstance(this).a("edit_photo", bundle);
        }
    }

    private void H0() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitleTextColor(-1);
        u0(toolbar);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 == null) {
            return;
        }
        aVarL0.t(true);
        aVarL0.A(true);
    }

    private void I0(StickerImageView stickerImageView) {
        for (int i10 = 0; i10 < this.f22776j.size(); i10++) {
            StickerImageView stickerImageView2 = (StickerImageView) this.f22776j.get(i10);
            stickerImageView2.setControlsGone(stickerImageView2 != stickerImageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_info_gray_24dp);
        builder.setTitle(getString(R.string.confirm_exit));
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_msg_dont_show_again, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_msg)).setText(R.string.dialog_confirm_exit_msg);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checkbox);
        builder.setView(viewInflate);
        builder.setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: gf.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AddStickerActivity.z0(this.f39137a, checkBox, dialogInterface, i10);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        alertDialogCreate.show();
    }

    private void K0(boolean z10) {
        if (z10) {
            this.f22769c.setVisibility(0);
        } else {
            this.f22769c.setVisibility(8);
        }
    }

    private void L0(StickerImageView stickerImageView) {
        int iIndexOf = this.f22776j.indexOf(stickerImageView);
        if (iIndexOf == -1) {
            return;
        }
        this.f22777k = stickerImageView;
        I0(stickerImageView);
        int i10 = 0;
        while (i10 < this.f22771e.getChildCount()) {
            this.f22771e.getChildAt(i10).setBackgroundResource(i10 == iIndexOf ? R.drawable.bg_rounded_corner_sticker : R.color.transparent);
            i10++;
        }
    }

    public static /* synthetic */ void x0(final AddStickerActivity addStickerActivity, Handler handler, final Uri uri) {
        addStickerActivity.getClass();
        handler.post(new Runnable() { // from class: gf.d
            @Override // java.lang.Runnable
            public final void run() {
                AddStickerActivity.A0(this.f39135a, uri);
            }
        });
    }

    public static /* synthetic */ void y0(AddStickerActivity addStickerActivity, View view) {
        for (int i10 = 0; i10 < addStickerActivity.f22771e.getChildCount(); i10++) {
            if (addStickerActivity.f22771e.getChildAt(i10) == view.getParent()) {
                addStickerActivity.L0((StickerImageView) addStickerActivity.f22776j.get(i10));
                return;
            }
        }
    }

    public static /* synthetic */ void z0(AddStickerActivity addStickerActivity, CheckBox checkBox, DialogInterface dialogInterface, int i10) {
        addStickerActivity.getClass();
        if (checkBox.isChecked()) {
            addStickerActivity.f22779m.j(R.string.pref_show_confirm_exit_editor, false);
        }
        addStickerActivity.F0(null);
    }

    public void F0(Uri uri) {
        Intent intent = new Intent();
        intent.setData(uri);
        setResult(-1, intent);
        finish();
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView.c
    public void e(StickerView stickerView) {
        int iIndexOf = this.f22776j.indexOf(stickerView);
        if (iIndexOf == -1) {
            return;
        }
        this.f22771e.removeViewAt(iIndexOf);
        this.f22770d.removeView(stickerView);
        this.f22776j.remove(stickerView);
        if (this.f22776j.size() != 0) {
            L0((StickerImageView) this.f22776j.get(0));
            return;
        }
        this.f22772f.setVisible(false);
        this.f22778l = false;
        this.f22777k = null;
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView.c
    public void j(StickerView stickerView) {
        StickerImageView stickerImageView = this.f22777k;
        if (stickerView == stickerImageView) {
            stickerImageView.setControlItemsHidden(false);
        } else {
            if (this.f22776j.indexOf(stickerView) == -1) {
                return;
            }
            L0((StickerImageView) stickerView);
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1111 && i11 == -1 && intent != null) {
            E0(intent.getStringExtra(MBridgeConstans.DYNAMIC_VIEW_WX_PATH));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.button_add_sticker) {
            Intent intent = new Intent(this, (Class<?>) FilePickerActivity.class);
            intent.putExtra("type", 2);
            startActivityForResult(intent, 1111);
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        AzRecorderApp.d().M(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_image_add_sticker);
        this.f22769c = (ViewGroup) findViewById(R.id.layout_progress_bar);
        Button button = (Button) findViewById(R.id.button_add_sticker);
        this.f22770d = (FrameLayout) findViewById(R.id.sticker_container);
        this.f22771e = (LinearLayout) findViewById(R.id.thumb_container);
        ImageView imageView = (ImageView) findViewById(R.id.iv_sticker);
        button.setOnClickListener(this);
        H0();
        this.f22773g = getIntent().getData();
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), this.f22773g);
            this.f22774h = bitmap;
            imageView.setImageBitmap(bitmap);
            imageView.getLocationInWindow(new int[2]);
            this.f22770d.getLocationInWindow(new int[2]);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
        getOnBackPressedDispatcher().g(this, new a(true));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.draw_image, menu);
        this.f22772f = menu.findItem(R.id.main_action_draw);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e.m(this);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.main_action_draw) {
            this.f22775i = o.a(this.f22774h, this.f22776j);
            G0();
        }
        if (menuItem.getItemId() == 16908332) {
            F0(null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView.c
    public void u(StickerView stickerView) {
    }
}
