package com.hecorat.screenrecorder.free.activities.image_editor;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.activities.image_editor.AddTextActivity;
import com.hecorat.screenrecorder.free.widget.StickerTextView;
import com.hecorat.screenrecorder.free.widget.StickerView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import nh.f0;
import nh.o;
import wf.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class AddTextActivity extends d implements View.OnClickListener, j.c, StickerView.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f22781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f22782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Spinner f22783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Button f22784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FrameLayout f22785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f22786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MenuItem f22787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Uri f22788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f22789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Bitmap f22790l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f22793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f22794p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f22797s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private b f22802x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    lg.a f22803y;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f22791m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22792n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f22795q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f22796r = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList f22798t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ArrayList f22799u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ArrayList f22800v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ArrayList f22801w = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends ArrayAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f22805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22806b;

        public b(Context context, List list) {
            super(context, R.layout.simple_spinner_item, list);
            this.f22805a = list;
        }

        public void a(int i10) {
            this.f22806b = i10;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            View viewInflate = AddTextActivity.this.getLayoutInflater().inflate(com.hecorat.screenrecorder.free.R.layout.spinner_add_text_layout, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(com.hecorat.screenrecorder.free.R.id.tv_text);
            textView.setText((CharSequence) this.f22805a.get(i10));
            ImageView imageView = (ImageView) viewInflate.findViewById(com.hecorat.screenrecorder.free.R.id.iv_chosen_text);
            textView.setTypeface(Typeface.createFromFile(((StickerTextView) AddTextActivity.this.f22801w.get(i10)).getFontPath()));
            if (i10 == this.f22806b) {
                viewInflate.setBackgroundColor(androidx.core.content.a.getColor(AddTextActivity.this, com.hecorat.screenrecorder.free.R.color.deep_sea_green_opacity));
                imageView.setVisibility(0);
            }
            return viewInflate;
        }
    }

    public static /* synthetic */ void A0(final AddTextActivity addTextActivity, Handler handler) {
        addTextActivity.getClass();
        final ArrayList arrayListB = og.b.b();
        handler.post(new Runnable() { // from class: gf.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f39145a.J0(arrayListB);
            }
        });
    }

    public static /* synthetic */ void C0(AddTextActivity addTextActivity, CheckBox checkBox, DialogInterface dialogInterface, int i10) {
        addTextActivity.getClass();
        if (checkBox.isChecked()) {
            addTextActivity.f22803y.j(com.hecorat.screenrecorder.free.R.string.pref_show_confirm_exit_editor, false);
        }
        addTextActivity.I0(null);
    }

    private void G0(String str, String str2, int i10, int i11) {
        this.f22797s = str2;
        this.f22793o = i10;
        this.f22794p = i11;
        StickerTextView stickerTextView = new StickerTextView(this, 0.5f);
        stickerTextView.setText(str);
        stickerTextView.setTextFont(str2);
        stickerTextView.setTextColor(i10);
        stickerTextView.setBgColor(i11);
        stickerTextView.setListener(this);
        this.f22792n = this.f22801w.size();
        this.f22801w.add(stickerTextView);
        this.f22785g.addView(stickerTextView);
        this.f22798t.add(str);
        this.f22802x.notifyDataSetChanged();
        this.f22782d.setVisibility(0);
        if (this.f22798t.size() > 1) {
            this.f22783e.setVisibility(0);
        }
        S0(this.f22792n);
        this.f22791m = true;
        this.f22787i.setVisible(true);
    }

    private void H0(String str, String str2, int i10, int i11) {
        this.f22798t.set(this.f22792n, str);
        this.f22802x.notifyDataSetChanged();
        this.f22782d.setText(str);
        this.f22782d.setTypeface(Typeface.createFromFile(str2));
        StickerTextView stickerTextView = (StickerTextView) this.f22801w.get(this.f22792n);
        stickerTextView.setText(str);
        stickerTextView.setTextFont(str2);
        stickerTextView.setTextColor(i10);
        stickerTextView.setBgColor(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            og.a aVar = (og.a) obj;
            String strA = aVar.a();
            this.f22799u.add(aVar.b());
            this.f22800v.add(strA);
        }
        if (this.f22799u.size() != 0) {
            this.f22797s = (String) this.f22799u.get(0);
        }
        this.f22795q = true;
        if (this.f22796r) {
            Q0(true);
        }
    }

    private void K0() {
        if (this.f22788j != null) {
            R0(true);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            final Handler handler = new Handler(Looper.getMainLooper());
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: gf.g
                @Override // java.lang.Runnable
                public final void run() {
                    AddTextActivity addTextActivity = this.f39141a;
                    f0.H(addTextActivity, addTextActivity.f22790l, true, new f0.e() { // from class: gf.j
                        @Override // nh.f0.e
                        public final void a(Uri uri) {
                            AddTextActivity.y0(addTextActivity, handler, uri);
                        }
                    });
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString("edit_action", "text");
            FirebaseAnalytics.getInstance(this).a("edit_photo", bundle);
        }
    }

    private void L0() {
        Toolbar toolbar = (Toolbar) findViewById(com.hecorat.screenrecorder.free.R.id.tool_bar);
        toolbar.setTitleTextColor(-1);
        u0(toolbar);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 == null) {
            return;
        }
        aVarL0.t(true);
        aVarL0.A(true);
    }

    private void N0(int i10) {
        int i11 = 0;
        while (i11 < this.f22801w.size()) {
            ((StickerTextView) this.f22801w.get(i11)).setControlsGone(i11 != i10);
            i11++;
        }
    }

    private void O0() {
        this.f22781c = (ViewGroup) findViewById(com.hecorat.screenrecorder.free.R.id.layout_progress_bar);
        this.f22784f = (Button) findViewById(com.hecorat.screenrecorder.free.R.id.button_add_text);
        this.f22785g = (FrameLayout) findViewById(com.hecorat.screenrecorder.free.R.id.text_container);
        this.f22786h = (ImageView) findViewById(com.hecorat.screenrecorder.free.R.id.iv_main_image);
        this.f22782d = (TextView) findViewById(com.hecorat.screenrecorder.free.R.id.tv_selected_text);
        this.f22783e = (Spinner) findViewById(com.hecorat.screenrecorder.free.R.id.spinner_text_list);
        this.f22784f.setOnClickListener(this);
        b bVar = new b(this, this.f22798t);
        this.f22802x = bVar;
        this.f22783e.setAdapter((SpinnerAdapter) bVar);
        this.f22783e.setOnItemSelectedListener(new a());
        this.f22793o = -16711936;
        this.f22794p = 0;
    }

    private void P0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(com.hecorat.screenrecorder.free.R.drawable.ic_info_gray_24dp);
        builder.setTitle(getString(com.hecorat.screenrecorder.free.R.string.confirm_exit));
        View viewInflate = LayoutInflater.from(this).inflate(com.hecorat.screenrecorder.free.R.layout.dialog_msg_dont_show_again, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(com.hecorat.screenrecorder.free.R.id.tv_msg)).setText(com.hecorat.screenrecorder.free.R.string.dialog_confirm_exit_msg);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(com.hecorat.screenrecorder.free.R.id.checkbox);
        builder.setView(viewInflate);
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(com.hecorat.screenrecorder.free.R.string.yes, new DialogInterface.OnClickListener() { // from class: gf.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AddTextActivity.C0(this.f39143a, checkBox, dialogInterface, i10);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        alertDialogCreate.show();
    }

    private void Q0(boolean z10) {
        String text;
        int bgColor;
        String str;
        int i10;
        if (z10) {
            String str2 = this.f22797s;
            text = "MyText";
            str = str2;
            i10 = this.f22793o;
            bgColor = this.f22794p;
        } else {
            StickerTextView stickerTextView = (StickerTextView) this.f22801w.get(this.f22792n);
            text = stickerTextView.getText();
            String fontPath = stickerTextView.getFontPath();
            int textColor = stickerTextView.getTextColor();
            bgColor = stickerTextView.getBgColor();
            str = fontPath;
            i10 = textColor;
        }
        j jVarF = j.f(text, str, i10, bgColor, z10, this.f22799u, this.f22800v);
        jVarF.h(this);
        jVarF.show(getFragmentManager(), "");
    }

    private void R0(boolean z10) {
        if (z10) {
            this.f22781c.setVisibility(0);
        } else {
            this.f22781c.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(int i10) {
        this.f22792n = i10;
        if (i10 < 0) {
            return;
        }
        StickerTextView stickerTextView = (StickerTextView) this.f22801w.get(i10);
        this.f22782d.setText(stickerTextView.getText());
        this.f22782d.setTypeface(Typeface.createFromFile(stickerTextView.getFontPath()));
        this.f22783e.setSelection(i10);
        ((StickerView) this.f22801w.get(i10)).setVisibility(0);
        N0(i10);
    }

    public static /* synthetic */ void x0(AddTextActivity addTextActivity, Uri uri) {
        addTextActivity.R0(false);
        addTextActivity.I0(uri);
    }

    public static /* synthetic */ void y0(final AddTextActivity addTextActivity, Handler handler, final Uri uri) {
        addTextActivity.getClass();
        handler.post(new Runnable() { // from class: gf.k
            @Override // java.lang.Runnable
            public final void run() {
                AddTextActivity.x0(this.f39149a, uri);
            }
        });
    }

    public void I0(Uri uri) {
        Intent intent = new Intent();
        intent.setData(uri);
        setResult(-1, intent);
        finish();
    }

    public void M0() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: gf.f
            @Override // java.lang.Runnable
            public final void run() {
                AddTextActivity.A0(this.f39139a, handler);
            }
        });
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView.c
    public void e(StickerView stickerView) {
        int iIndexOf = this.f22801w.indexOf(stickerView);
        if (iIndexOf == -1) {
            return;
        }
        this.f22785g.removeView(stickerView);
        this.f22798t.remove(iIndexOf);
        this.f22801w.remove(iIndexOf);
        int size = this.f22801w.size();
        int i10 = this.f22792n;
        if (size == i10) {
            this.f22792n = i10 - 1;
        }
        if (size == 0) {
            this.f22782d.setVisibility(4);
            this.f22787i.setVisible(false);
            this.f22791m = false;
            this.f22792n = -1;
        } else {
            S0(this.f22792n);
        }
        if (size <= 1) {
            this.f22783e.setVisibility(4);
        }
        this.f22802x.notifyDataSetChanged();
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView.c
    public void j(StickerView stickerView) {
        int iIndexOf = this.f22801w.indexOf(stickerView);
        if (iIndexOf == -1) {
            return;
        }
        S0(iIndexOf);
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onBackPressed() {
        if (this.f22791m && this.f22803y.b(com.hecorat.screenrecorder.free.R.string.pref_show_confirm_exit_editor, true)) {
            P0();
        } else {
            I0(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != com.hecorat.screenrecorder.free.R.id.button_add_text) {
            if (id2 != com.hecorat.screenrecorder.free.R.id.select_text_container) {
                return;
            }
            if (this.f22798t.size() > 1) {
                this.f22783e.performClick();
            }
            S0(this.f22792n);
            return;
        }
        if (!this.f22795q) {
            this.f22796r = true;
        } else {
            this.f22796r = false;
            Q0(true);
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        AzRecorderApp.d().d(this);
        super.onCreate(bundle);
        setContentView(com.hecorat.screenrecorder.free.R.layout.activity_image_add_text);
        L0();
        O0();
        this.f22788j = getIntent().getData();
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), this.f22788j);
            this.f22789k = bitmap;
            this.f22786h.setImageBitmap(bitmap);
            this.f22786h.getLocationInWindow(new int[2]);
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
        M0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.hecorat.screenrecorder.free.R.menu.draw_image, menu);
        this.f22787i = menu.findItem(com.hecorat.screenrecorder.free.R.id.main_action_draw);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == com.hecorat.screenrecorder.free.R.id.main_action_draw) {
            this.f22790l = o.a(this.f22789k, this.f22801w);
            K0();
        }
        if (menuItem.getItemId() == 16908332) {
            I0(null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // wf.j.c
    public void p(String str, String str2, int i10, int i11, boolean z10) {
        if (z10) {
            G0(str, str2, i10, i11);
        } else {
            H0(str, str2, i10, i11);
        }
    }

    @Override // com.hecorat.screenrecorder.free.widget.StickerView.c
    public void u(StickerView stickerView) {
        Q0(false);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            AddTextActivity.this.f22802x.a(i10);
            AddTextActivity.this.S0(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }
}
