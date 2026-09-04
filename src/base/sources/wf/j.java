package wf;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import tf.p1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j extends DialogFragment implements View.OnClickListener, wf.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f56216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f56217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private wf.c f56218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private wf.c f56219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f56220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p1 f56221f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void p(String str, String str2, int i10, int i11, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class d extends ArrayAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f56228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f56229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f56230c;

        public d(ArrayList arrayList, ArrayList arrayList2, String str) {
            super(j.this.f56217b, R.layout.simple_spinner_item, arrayList);
            this.f56229b = arrayList;
            this.f56230c = arrayList2;
            this.f56228a = str;
        }

        public String a() {
            return (String) this.f56230c.get(this.f56229b.indexOf(this.f56228a));
        }

        public void b(String str) {
            this.f56228a = str;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            View viewInflate = j.this.f56217b.getLayoutInflater().inflate(com.hecorat.screenrecorder.free.R.layout.spinner_add_text_layout, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(com.hecorat.screenrecorder.free.R.id.tv_text);
            textView.setText((CharSequence) this.f56229b.get(i10));
            textView.setTypeface(Typeface.createFromFile((String) this.f56230c.get(i10)));
            if (i10 == this.f56229b.indexOf(this.f56228a)) {
                viewInflate.setBackgroundColor(androidx.core.content.a.getColor(j.this.f56217b, com.hecorat.screenrecorder.free.R.color.deep_sea_green_opacity));
            }
            return viewInflate;
        }
    }

    public static /* synthetic */ void b(AlertDialog alertDialog, View view, boolean z10) {
        if (!z10 || alertDialog == null || alertDialog.getWindow() == null) {
            return;
        }
        alertDialog.getWindow().setSoftInputMode(5);
    }

    public static /* synthetic */ void c(j jVar, d dVar, DialogInterface dialogInterface, int i10) {
        if (jVar.f56220e != null) {
            jVar.f56220e.p(jVar.f56221f.A.getText().toString(), dVar.a(), jVar.f56218c.z(), jVar.f56219d.z(), jVar.getArguments().getBoolean("add_new"));
        }
    }

    public static j f(String str, String str2, int i10, int i11, boolean z10, ArrayList arrayList, ArrayList arrayList2) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putString("text", str);
        bundle.putString("font_path", str2);
        bundle.putInt(TtmlNode.ATTR_TTS_COLOR, i10);
        bundle.putInt("backgrounds", i11);
        bundle.putBoolean("add_new", z10);
        bundle.putStringArrayList("font_paths", arrayList);
        bundle.putStringArrayList("font_names", arrayList2);
        jVar.setArguments(bundle);
        return jVar;
    }

    private void g(View view, int i10) {
        try {
            view.setBackground(new com.hecorat.screenrecorder.free.widget.a(i10));
        } catch (UnsupportedOperationException e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    @Override // wf.c.a
    public void a(int i10) {
        if (this.f56216a) {
            g(this.f56221f.F, i10);
            this.f56221f.A.setTextColor(i10);
            this.f56218c.B(i10);
        } else {
            g(this.f56221f.E, i10);
            this.f56221f.A.setBackgroundColor(i10);
            this.f56219d.B(i10);
        }
    }

    public void h(c cVar) {
        this.f56220e = cVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        getFragmentManager().beginTransaction().remove(this).commit();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case com.hecorat.screenrecorder.free.R.id.iv_close /* 2131362433 */:
                this.f56221f.A.setText("");
                break;
            case com.hecorat.screenrecorder.free.R.id.v_bg_color /* 2131363371 */:
                this.f56219d.show();
                this.f56216a = false;
                break;
            case com.hecorat.screenrecorder.free.R.id.v_text_color /* 2131363372 */:
                this.f56218c.show();
                this.f56216a = true;
                break;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.f56217b = getActivity();
        Bundle arguments = getArguments();
        String string = arguments.getString("text");
        String string2 = arguments.getString("font_path");
        int i10 = arguments.getInt(TtmlNode.ATTR_TTS_COLOR);
        int i11 = arguments.getInt("backgrounds");
        ArrayList<String> stringArrayList = arguments.getStringArrayList("font_paths");
        ArrayList<String> stringArrayList2 = arguments.getStringArrayList("font_names");
        String str = stringArrayList2.get(stringArrayList.indexOf(string2));
        Typeface typefaceCreateFromFile = Typeface.createFromFile(string2);
        p1 p1Var = (p1) androidx.databinding.g.h(LayoutInflater.from(this.f56217b), com.hecorat.screenrecorder.free.R.layout.dialog_edit_add_text, null, false);
        this.f56221f = p1Var;
        p1Var.A.setText(string);
        this.f56221f.A.setTypeface(typefaceCreateFromFile);
        this.f56221f.A.setSelection(string.length());
        this.f56221f.A.setTextColor(i10);
        this.f56221f.A.setBackgroundColor(i11);
        this.f56221f.D.setText(str);
        this.f56221f.D.setTypeface(typefaceCreateFromFile);
        g(this.f56221f.E, i11);
        g(this.f56221f.F, i10);
        this.f56218c = new wf.c(this.f56217b, i10, com.hecorat.screenrecorder.free.R.string.text_color);
        this.f56219d = new wf.c(this.f56217b, i11, com.hecorat.screenrecorder.free.R.string.background_color);
        this.f56218c.C(this);
        this.f56218c.A(true);
        this.f56219d.C(this);
        this.f56219d.A(true);
        this.f56221f.B.setOnClickListener(this);
        this.f56221f.F.setOnClickListener(this);
        this.f56221f.E.setOnClickListener(this);
        final d dVar = new d(stringArrayList2, stringArrayList, str);
        this.f56221f.C.setAdapter((SpinnerAdapter) dVar);
        this.f56221f.C.setOnItemSelectedListener(new a(stringArrayList, stringArrayList2, dVar));
        this.f56221f.C.setSelection(stringArrayList.indexOf(string2));
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(getActivity()).setView(this.f56221f.B()).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: wf.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                j.c(this.f56206a, dVar, dialogInterface, i12);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        this.f56221f.A.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: wf.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                j.b(alertDialogCreate, view, z10);
            }
        });
        this.f56221f.A.addTextChangedListener(new b(alertDialogCreate));
        alertDialogCreate.setCanceledOnTouchOutside(false);
        return alertDialogCreate;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f56222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f56223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f56224c;

        a(ArrayList arrayList, ArrayList arrayList2, d dVar) {
            this.f56222a = arrayList;
            this.f56223b = arrayList2;
            this.f56224c = dVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            String str = (String) this.f56222a.get(i10);
            String str2 = (String) this.f56223b.get(i10);
            Typeface typefaceCreateFromFile = Typeface.createFromFile(str);
            j.this.f56221f.D.setTypeface(typefaceCreateFromFile);
            j.this.f56221f.D.setText(str2);
            j.this.f56221f.A.setTypeface(typefaceCreateFromFile);
            this.f56224c.b(str2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog f56226a;

        b(AlertDialog alertDialog) {
            this.f56226a = alertDialog;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AlertDialog alertDialog = this.f56226a;
            if (alertDialog != null) {
                Button button = alertDialog.getButton(-1);
                boolean zIsEmpty = TextUtils.isEmpty(editable.toString());
                button.setEnabled(!zIsEmpty);
                if (zIsEmpty) {
                    j.this.f56221f.A.setHint(com.hecorat.screenrecorder.free.R.string.enter_text_hint);
                } else {
                    j.this.f56221f.A.setHint((CharSequence) null);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
