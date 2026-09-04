package com.hecorat.screenrecorder.free.activities.image_editor;

import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.d0;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.g;
import bm.o;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.theartofdev.edmodo.cropper.CropImageView;
import gl.r;
import ig.e;
import ig.l;
import ig.z;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import lf.c;
import lg.i;
import nh.f0;
import tf.q;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001OB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\b¢\u0006\u0004\b*\u0010\u000bJ\u0017\u0010-\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\u0016\u00109\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010I\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010DR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/image_editor/ImageCropActivity;", "Landroidx/appcompat/app/d;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Lfl/g0;", "C0", "B0", "", "selected", "G0", "(Z)V", "A0", "Lig/e$a;", "demoPreset", "F0", "(Lig/e$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lig/e;", "fragment", "D0", "(Lig/e;)V", "Llg/i;", "options", "E0", "(Llg/i;)V", "show", "H0", "Landroid/net/Uri;", "uri", "z0", "(Landroid/net/Uri;)V", "", "newShape", "y0", "(I)V", "", "newRatio", "x0", "(Ljava/lang/String;)V", "c", "Llg/i;", "imageCropOptions", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lig/e;", "currentFragment", "e", "Landroid/net/Uri;", "imageUri", "f", "Ljava/lang/String;", "ratio", "g", "I", "curTab", "h", "fromContext", "i", "shapeType", "Ltf/q;", "j", "Ltf/q;", "binding", CampaignEx.JSON_KEY_AD_K, "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCropActivity extends d implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private e currentFragment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Uri imageUri;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int curTab;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int fromContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private q binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private i imageCropOptions = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String ratio = "FREE";

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int shapeType = 1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends d0 {
        b() {
            super(true);
        }

        @Override // androidx.activity.d0
        public void d() {
            ImageCropActivity.this.z0(null);
        }
    }

    private final void A0() {
        FragmentManager fragmentManager = getFragmentManager();
        if (this.curTab == 0) {
            fragmentManager.beginTransaction().replace(R.id.values_layout, z.a(this.shapeType)).commit();
        } else {
            fragmentManager.beginTransaction().replace(R.id.values_layout, l.c(this.ratio)).commit();
        }
    }

    private final void B0() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        G0(true);
        q qVar = this.binding;
        if (qVar != null && (textView3 = qVar.L) != null) {
            textView3.setTextColor(androidx.core.content.a.getColor(this, R.color.sunset_orange));
        }
        q qVar2 = this.binding;
        if (qVar2 != null && (textView2 = qVar2.K) != null) {
            textView2.setTextColor(androidx.core.content.a.getColor(this, R.color.white_grey));
        }
        q qVar3 = this.binding;
        if (qVar3 == null || (textView = qVar3.J) == null) {
            return;
        }
        textView.setTextColor(androidx.core.content.a.getColor(this, R.color.white_grey));
    }

    private final void C0() {
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

    private final void F0(e.a demoPreset) {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content, e.g(demoPreset, this.imageUri)).commit();
        fragmentManager.executePendingTransactions();
    }

    private final void G0(boolean selected) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        q qVar;
        ImageView imageView4;
        int i10 = this.shapeType;
        if (i10 == 1) {
            q qVar2 = this.binding;
            if (qVar2 == null || (imageView = qVar2.D) == null) {
                return;
            }
            imageView.setImageResource(selected ? R.drawable.ic_shape_rectangle_orange : R.drawable.ic_shape_rectangle);
            return;
        }
        if (i10 == 2) {
            q qVar3 = this.binding;
            if (qVar3 == null || (imageView2 = qVar3.D) == null) {
                return;
            }
            imageView2.setImageResource(selected ? R.drawable.ic_shape_square_orange : R.drawable.ic_shape_square);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4 || (qVar = this.binding) == null || (imageView4 = qVar.D) == null) {
                return;
            }
            imageView4.setImageResource(selected ? R.drawable.ic_shape_circle_orange : R.drawable.ic_shape_circle);
            return;
        }
        q qVar4 = this.binding;
        if (qVar4 == null || (imageView3 = qVar4.D) == null) {
            return;
        }
        imageView3.setImageResource(selected ? R.drawable.ic_shape_oval_orange : R.drawable.ic_shape_oval);
    }

    public final void D0(e fragment) {
        this.currentFragment = fragment;
    }

    public final void E0(i options) {
        s.h(options, "options");
        this.imageCropOptions = options;
    }

    public final void H0(boolean show) {
        ProgressBar progressBar;
        ProgressBar progressBar2;
        if (show) {
            q qVar = this.binding;
            if (qVar == null || (progressBar2 = qVar.H) == null) {
                return;
            }
            progressBar2.setVisibility(0);
            return;
        }
        q qVar2 = this.binding;
        if (qVar2 == null || (progressBar = qVar2.H) == null) {
            return;
        }
        progressBar.setVisibility(4);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        s.h(v10, "v");
        int id2 = v10.getId();
        if (id2 != R.id.layout_ratio) {
            if (id2 == R.id.layout_shape && this.curTab != 0) {
                this.curTab = 0;
                B0();
                A0();
                return;
            }
            return;
        }
        if (this.curTab == 1) {
            return;
        }
        this.curTab = 1;
        G0(false);
        q qVar = this.binding;
        if (qVar != null && (textView3 = qVar.L) != null) {
            textView3.setTextColor(androidx.core.content.a.getColor(this, R.color.white_grey));
        }
        q qVar2 = this.binding;
        if (qVar2 != null && (textView2 = qVar2.K) != null) {
            textView2.setTextColor(androidx.core.content.a.getColor(this, R.color.sunset_orange));
        }
        q qVar3 = this.binding;
        if (qVar3 != null && (textView = qVar3.J) != null) {
            textView.setTextColor(androidx.core.content.a.getColor(this, R.color.sunset_orange));
        }
        A0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        TextView textView;
        super.onCreate(savedInstanceState);
        this.binding = (q) g.j(this, R.layout.activity_image_crop);
        C0();
        this.imageUri = getIntent().getData();
        this.fromContext = getIntent().getIntExtra("from", 0);
        A0();
        findViewById(R.id.layout_shape).setOnClickListener(this);
        findViewById(R.id.layout_ratio).setOnClickListener(this);
        q qVar = this.binding;
        if (qVar != null && (textView = qVar.K) != null) {
            textView.setText("FREE");
        }
        F0(e.a.RECT);
        B0();
        lf.i.f44428h.a(lf.l.f44461f.a(lf.l.a.SHARE), c.f44397g.a(c.a.SHARE));
        getOnBackPressedDispatcher().g(this, new b());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.crop_image, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        s.h(item, "item");
        e eVar = this.currentFragment;
        if (eVar != null) {
            s.e(eVar);
            if (eVar.onOptionsItemSelected(item)) {
                return true;
            }
        }
        if (item.getItemId() == 16908332) {
            z0(null);
        }
        return super.onOptionsItemSelected(item);
    }

    public final void x0(String newRatio) {
        ImageView imageView;
        ImageView imageView2;
        List listL;
        ImageView imageView3;
        ImageView imageView4;
        TextView textView;
        ImageView imageView5;
        ImageView imageView6;
        s.h(newRatio, "newRatio");
        this.ratio = newRatio;
        if (s.c(newRatio, "FREE")) {
            this.imageCropOptions.f44521g = false;
            int i10 = this.shapeType;
            if (i10 == 2) {
                this.shapeType = 1;
                q qVar = this.binding;
                if (qVar != null && (imageView6 = qVar.D) != null) {
                    imageView6.setImageResource(R.drawable.ic_shape_rectangle);
                }
            } else if (i10 == 4) {
                this.shapeType = 3;
                q qVar2 = this.binding;
                if (qVar2 != null && (imageView5 = qVar2.D) != null) {
                    imageView5.setImageResource(R.drawable.ic_shape_oval);
                }
            }
        } else {
            this.imageCropOptions.f44521g = true;
            if (s.c(newRatio, "1:1")) {
                int i11 = this.shapeType;
                if (i11 == 1) {
                    this.shapeType = 2;
                    q qVar3 = this.binding;
                    if (qVar3 != null && (imageView4 = qVar3.D) != null) {
                        imageView4.setImageResource(R.drawable.ic_shape_square);
                    }
                } else if (i11 == 3) {
                    this.shapeType = 4;
                    q qVar4 = this.binding;
                    if (qVar4 != null && (imageView3 = qVar4.D) != null) {
                        imageView3.setImageResource(R.drawable.ic_shape_circle);
                    }
                }
            } else {
                int i12 = this.shapeType;
                if (i12 == 2) {
                    this.shapeType = 1;
                    q qVar5 = this.binding;
                    if (qVar5 != null && (imageView2 = qVar5.D) != null) {
                        imageView2.setImageResource(R.drawable.ic_shape_rectangle);
                    }
                } else if (i12 == 4) {
                    this.shapeType = 3;
                    q qVar6 = this.binding;
                    if (qVar6 != null && (imageView = qVar6.D) != null) {
                        imageView.setImageResource(R.drawable.ic_shape_oval);
                    }
                }
            }
            List listJ = new o(":").j(newRatio, 0);
            if (!listJ.isEmpty()) {
                ListIterator listIterator = listJ.listIterator(listJ.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listL = r.l();
                        break;
                    } else if (((String) listIterator.previous()).length() != 0) {
                        listL = r.A0(listJ, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listL = r.l();
                break;
            }
            String[] strArr = (String[]) listL.toArray(new String[0]);
            i iVar = this.imageCropOptions;
            String str = strArr[0];
            s.e(str);
            Integer numValueOf = Integer.valueOf(Integer.parseInt(str));
            String str2 = strArr[1];
            s.e(str2);
            iVar.f44518d = new Pair(numValueOf, Integer.valueOf(Integer.parseInt(str2)));
        }
        e eVar = this.currentFragment;
        s.e(eVar);
        eVar.h(this.imageCropOptions);
        q qVar7 = this.binding;
        if (qVar7 == null || (textView = qVar7.K) == null) {
            return;
        }
        textView.setText(newRatio);
    }

    public final void y0(int newShape) {
        TextView textView;
        ImageView imageView;
        TextView textView2;
        ImageView imageView2;
        TextView textView3;
        ImageView imageView3;
        TextView textView4;
        ImageView imageView4;
        this.shapeType = newShape;
        if (newShape == 1) {
            q qVar = this.binding;
            if (qVar != null && (imageView = qVar.D) != null) {
                imageView.setImageResource(R.drawable.ic_shape_rectangle_orange);
            }
            i iVar = this.imageCropOptions;
            iVar.f44516b = CropImageView.c.RECTANGLE;
            if (iVar.f44521g) {
                Pair pair = iVar.f44518d;
                if (s.c(pair.first, pair.second)) {
                    this.imageCropOptions.f44521g = false;
                    q qVar2 = this.binding;
                    if (qVar2 != null && (textView = qVar2.K) != null) {
                        textView.setText("FREE");
                    }
                    this.ratio = "FREE";
                }
            }
        } else if (newShape == 2) {
            q qVar3 = this.binding;
            if (qVar3 != null && (imageView2 = qVar3.D) != null) {
                imageView2.setImageResource(R.drawable.ic_shape_square_orange);
            }
            i iVar2 = this.imageCropOptions;
            iVar2.f44516b = CropImageView.c.RECTANGLE;
            iVar2.f44518d = new Pair(1, 1);
            q qVar4 = this.binding;
            if (qVar4 != null && (textView2 = qVar4.K) != null) {
                textView2.setText("1:1");
            }
            this.imageCropOptions.f44521g = true;
            this.ratio = "1:1";
        } else if (newShape == 3) {
            q qVar5 = this.binding;
            if (qVar5 != null && (imageView3 = qVar5.D) != null) {
                imageView3.setImageResource(R.drawable.ic_shape_oval_orange);
            }
            i iVar3 = this.imageCropOptions;
            iVar3.f44516b = CropImageView.c.OVAL;
            if (iVar3.f44521g) {
                Pair pair2 = iVar3.f44518d;
                if (s.c(pair2.first, pair2.second)) {
                    this.imageCropOptions.f44521g = false;
                    q qVar6 = this.binding;
                    if (qVar6 != null && (textView3 = qVar6.K) != null) {
                        textView3.setText(R.string.free_crop);
                    }
                    this.ratio = "FREE";
                }
            }
        } else if (newShape == 4) {
            q qVar7 = this.binding;
            if (qVar7 != null && (imageView4 = qVar7.D) != null) {
                imageView4.setImageResource(R.drawable.ic_shape_circle_orange);
            }
            i iVar4 = this.imageCropOptions;
            iVar4.f44516b = CropImageView.c.OVAL;
            iVar4.f44518d = new Pair(1, 1);
            q qVar8 = this.binding;
            if (qVar8 != null && (textView4 = qVar8.K) != null) {
                textView4.setText("1:1");
            }
            this.imageCropOptions.f44521g = true;
            this.ratio = "1:1";
        }
        e eVar = this.currentFragment;
        s.e(eVar);
        eVar.h(this.imageCropOptions);
    }

    public final void z0(Uri uri) {
        if (this.fromContext == 5) {
            Intent intent = new Intent();
            intent.setData(uri);
            setResult(-1, intent);
        } else if (uri != null) {
            f0.B(this, uri, "image/*");
        }
        finish();
    }
}
