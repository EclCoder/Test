package com.hecorat.screenrecorder.free.activities;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.ChunkOffset64BitBox;
import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MetaBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.http.HttpStatusCodes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.googlecode.mp4parser.util.Path;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.VideoRepairActivity;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nh.f0;
import nh.k0;
import nh.l0;
import tf.s0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class VideoRepairActivity extends androidx.appcompat.app.d implements View.OnClickListener {
    public List A;
    public List B;
    public ArrayList C;
    public c D;
    public lg.a E;
    public s0 F;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22728c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22729d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22730e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22731f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22732g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22733h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22734i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22735j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22736k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22737l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22738m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22739n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22740o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22741p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f22742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f22743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f22744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public File f22745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InputStream f22746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RandomAccessFile f22747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f22748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f22749x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f22750y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f22751z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements FilenameFilter {
        public b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".mp4");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22753a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f22754b = true;

        public c() {
        }

        public static /* synthetic */ void a(c cVar, String str, Uri uri) {
            l0.A(VideoRepairActivity.this, "grant_permission_storage");
            f0.B(VideoRepairActivity.this, uri, "video/*");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (!VideoRepairActivity.this.f22738m) {
                if (!VideoRepairActivity.this.V0()) {
                    this.f22753a = 1;
                    return null;
                }
                if (VideoRepairActivity.this.f22728c != 0) {
                    publishProgress(Integer.valueOf((int) ((VideoRepairActivity.this.f22729d * 100) / VideoRepairActivity.this.f22728c)));
                }
            }
            if (isCancelled()) {
                this.f22754b = false;
                return null;
            }
            if (!VideoRepairActivity.this.f22737l) {
                VideoRepairActivity.this.W0(this);
            }
            if (VideoRepairActivity.this.f22750y.size() < 1 && VideoRepairActivity.this.f22751z.size() < 1) {
                this.f22753a = 1;
                return null;
            }
            publishProgress(102);
            if (isCancelled()) {
                this.f22754b = false;
                return null;
            }
            VideoRepairActivity videoRepairActivity = VideoRepairActivity.this;
            this.f22753a = videoRepairActivity.m1(videoRepairActivity, this) ? 0 : 2;
            return null;
        }

        public void c(int i10) {
            publishProgress(Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r10) {
            super.onPostExecute(r10);
            int color = androidx.core.content.a.getColor(VideoRepairActivity.this, R.color.red_orange);
            int i10 = this.f22753a;
            if (i10 == 0) {
                VideoRepairActivity videoRepairActivity = VideoRepairActivity.this;
                MediaScannerConnection.scanFile(videoRepairActivity, new String[]{videoRepairActivity.f22744s}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.hecorat.screenrecorder.free.activities.j
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri) {
                        VideoRepairActivity.c.a(this.f22832a, str, uri);
                    }
                });
                VideoRepairActivity.this.F.I.setText(R.string.repair_status_success);
                VideoRepairActivity.this.F.B.setVisibility(8);
                VideoRepairActivity.this.F.A.setVisibility(8);
            } else if (i10 == 1) {
                VideoRepairActivity.this.F.I.setText(R.string.repair_status_cannot_repair);
                VideoRepairActivity.this.F.I.setTextColor(color);
                VideoRepairActivity.this.F.B.setVisibility(8);
                VideoRepairActivity.this.F.A.setVisibility(8);
                VideoRepairActivity videoRepairActivity2 = VideoRepairActivity.this;
                f0.n(videoRepairActivity2, videoRepairActivity2.f22744s);
            } else if (i10 == 2) {
                VideoRepairActivity.this.F.I.setText(R.string.repair_status_failed);
                VideoRepairActivity.this.F.I.setTextColor(color);
                VideoRepairActivity.this.F.H.setText(R.string.reference_status_error);
                VideoRepairActivity.this.F.H.setTextColor(color);
                VideoRepairActivity.this.F.B.setEnabled(false);
                VideoRepairActivity.this.F.A.setEnabled(true);
                VideoRepairActivity videoRepairActivity3 = VideoRepairActivity.this;
                f0.n(videoRepairActivity3, videoRepairActivity3.f22744s);
            }
            VideoRepairActivity.this.f22739n = false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            int iIntValue = numArr[0].intValue();
            if (iIntValue <= 100) {
                VideoRepairActivity.this.F.I.setText(iIntValue + " %");
                return;
            }
            TextView textView = VideoRepairActivity.this.F.I;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(VideoRepairActivity.this.getString(R.string.repair_status_exporting_video));
            sb2.append(" ");
            sb2.append(iIntValue - 101);
            sb2.append(" %");
            textView.setText(sb2.toString());
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            super.onCancelled();
            VideoRepairActivity.this.f22739n = false;
            if (this.f22754b) {
                VideoRepairActivity videoRepairActivity = VideoRepairActivity.this;
                f0.n(videoRepairActivity, videoRepairActivity.f22744s);
            }
            VideoRepairActivity.this.finish();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            VideoRepairActivity.this.f22739n = true;
            VideoRepairActivity.this.F.I.setText("0 %");
            VideoRepairActivity.this.f22728c = new File(VideoRepairActivity.this.f22742q).length();
            VideoRepairActivity.this.F.A.setEnabled(false);
            VideoRepairActivity.this.F.B.setEnabled(false);
        }
    }

    public static /* synthetic */ int A0(File file, File file2) {
        if (file.lastModified() > file2.lastModified()) {
            return -1;
        }
        return file.lastModified() < file2.lastModified() ? 1 : 0;
    }

    private String P0() {
        File[] fileArrListFiles = new File(this.f22742q).getParentFile().listFiles(new b());
        Arrays.sort(fileArrListFiles, new Comparator() { // from class: ff.b2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VideoRepairActivity.A0((File) obj, (File) obj2);
            }
        });
        int i10 = 0;
        while (true) {
            if (i10 >= fileArrListFiles.length) {
                i10 = 0;
                break;
            }
            if (fileArrListFiles[i10].getAbsolutePath().equals(this.f22742q)) {
                break;
            }
            i10++;
        }
        int i11 = i10 - 1;
        int i12 = i10 + 1;
        while (true) {
            if (i11 <= -1 && i12 >= fileArrListFiles.length) {
                return "unknown";
            }
            byte b10 = i11 < 0 ? (byte) 1 : (byte) 0;
            if (i12 >= fileArrListFiles.length) {
                b10 = -1;
            }
            if (b10 == 0) {
                b10 = fileArrListFiles[i11].lastModified() - fileArrListFiles[i10].lastModified() >= fileArrListFiles[i10].lastModified() - fileArrListFiles[i12].lastModified() ? (byte) 1 : (byte) -1;
            }
            if (b10 < 0) {
                if (ThumbnailUtils.createVideoThumbnail(fileArrListFiles[i11].getAbsolutePath(), 2) != null) {
                    return fileArrListFiles[i11].getAbsolutePath();
                }
                i11--;
            } else {
                if (ThumbnailUtils.createVideoThumbnail(fileArrListFiles[i12].getAbsolutePath(), 2) != null) {
                    return fileArrListFiles[i12].getAbsolutePath();
                }
                i12++;
            }
        }
    }

    private boolean Q0(byte b10, byte b11, byte b12, byte b13) {
        String strReplace = String.format("%8s", Integer.toBinaryString(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)).replace(' ', '0');
        if (!strReplace.startsWith("0000000")) {
            return false;
        }
        String strReplace2 = String.format("%8s", Integer.toBinaryString(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)).replace(' ', '0');
        if (!strReplace2.endsWith(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
            return false;
        }
        int i10 = Integer.parseInt(strReplace.charAt(7) + strReplace2.substring(0, 7), 2);
        if (i10 >= 100 && i10 <= 200) {
            String strReplace3 = String.format("%8s", Integer.toBinaryString(b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)).replace(' ', '0');
            if (strReplace3.substring(0, 2).equals("10")) {
                return Integer.parseInt(strReplace3.substring(3, 7), 2) >= 12;
            }
            int i11 = Integer.parseInt(strReplace3.substring(3) + String.format("%8s", Integer.toBinaryString(b13 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)).replace(' ', '0').charAt(0), 2);
            if (i11 > 49) {
                return false;
            }
            if (i11 > 29 && i11 < 32) {
                return false;
            }
            if ((i11 <= 5 || i11 >= 20) && i11 >= 5) {
                return true;
            }
        }
        return false;
    }

    private boolean R0(byte[] bArr) {
        return Q0(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    private boolean S0(byte b10, byte b11) {
        char[] charArray = String.format("%8s", Integer.toBinaryString(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)).replace(' ', '0').toCharArray();
        int i10 = 0;
        for (int i11 = 7; i11 >= 0; i11--) {
            if (charArray[i11] == '1') {
                i10++;
                if (i10 == 3) {
                    return true;
                }
            } else if (i10 > 0) {
                return false;
            }
        }
        if (i10 == 0) {
            return false;
        }
        return i10 == 1 ? String.format("%8s", Integer.toBinaryString(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)).replace(' ', '0').endsWith("11") : String.format("%8s", Integer.toBinaryString(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)).replace(' ', '0').endsWith("1");
    }

    private boolean[] T0() {
        boolean[] zArr = {true, false};
        try {
            IsoFile isoFile = new IsoFile(this.f22743r);
            if (this.f22750y.size() > 0) {
                if (isoFile.getMovieBox().getBoxes(TrackBox.class).size() == 1) {
                    zArr[0] = false;
                    isoFile.close();
                    return zArr;
                }
            } else if (isoFile.getMovieBox().getBoxes(TrackBox.class).size() == 2) {
                zArr[1] = true;
            }
            isoFile.close();
            return zArr;
        } catch (IOException e10) {
            wp.a.e(e10);
            zArr[0] = false;
            return zArr;
        }
    }

    private String U0(Byte b10) {
        return String.format("%8s", Integer.toBinaryString(b10.byteValue() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)).replace(' ', '0');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V0() {
        this.f22738m = false;
        try {
            this.f22746u = new FileInputStream(this.f22745t);
            int i10 = 0;
            while (this.f22746u.available() > 0) {
                byte[] bArr = new byte[8];
                int i11 = i10 + this.f22746u.read(bArr);
                long jL1 = l1(bArr, 0);
                if (new String(bArr, 4, 4, StandardCharsets.ISO_8859_1).equals(MediaDataBox.TYPE)) {
                    this.f22735j = i11 - 8;
                    this.f22734i = this.f22745t.length() - ((long) this.f22735j);
                    if (jL1 == 1) {
                        this.f22736k = 1;
                        this.f22746u.skip(8L);
                        i11 += 8;
                    }
                    this.f22729d = i11;
                    this.f22738m = true;
                    break;
                }
                long j10 = jL1 - 8;
                this.f22746u.skip(j10);
                i10 = (int) (((long) i11) + j10);
            }
            this.f22746u.close();
            return true;
        } catch (IOException e10) {
            wp.a.e(e10);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(c cVar) {
        i1();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f22745t, CampaignEx.JSON_KEY_AD_R);
            this.f22747v = randomAccessFile;
            randomAccessFile.seek(this.f22729d);
            if (this.f22747v.read() > 0) {
                this.f22741p = true;
            } else {
                this.f22741p = this.f22747v.read() > 15;
            }
            this.f22747v.seek(this.f22729d);
            while (this.f22729d < this.f22728c - 1) {
                if (cVar.isCancelled()) {
                    return;
                }
                if (this.f22741p) {
                    this.f22749x.add(Long.valueOf(this.f22729d));
                    FileInputStream fileInputStream = new FileInputStream(this.f22745t);
                    this.f22746u = fileInputStream;
                    fileInputStream.skip(this.f22729d);
                    byte[] bArr = new byte[64000];
                    o1(bArr, this.f22746u.read(bArr));
                    this.f22746u.close();
                    cVar.c((int) ((this.f22729d * 100) / this.f22728c));
                } else {
                    this.C.add(Long.valueOf(this.f22729d));
                    p1();
                    cVar.c((int) ((this.f22729d * 100) / this.f22728c));
                }
            }
        } catch (IOException e10) {
            wp.a.e(e10);
        }
        this.f22737l = true;
    }

    private MovieBox X0(IsoFile isoFile, boolean z10) {
        int i10;
        Iterator it;
        MovieBox movieBox;
        VideoRepairActivity videoRepairActivity = this;
        try {
            int i11 = 0;
            MovieBox movieBox2 = (MovieBox) isoFile.getBoxes(MovieBox.class).get(0);
            Iterator it2 = Path.getPaths(isoFile, "/moov[0]/trak/mdia[0]/minf[0]/stbl[0]").iterator();
            while (it2.hasNext()) {
                try {
                    SampleTableBox sampleTableBox = (SampleTableBox) it2.next();
                    LinkedList linkedList = new LinkedList(sampleTableBox.getBoxes());
                    byte[] bArr = new byte[4];
                    ((SampleDescriptionBox) sampleTableBox.getBoxes(SampleDescriptionBox.class).get(i11)).getByteBuffer(12L, 4L).get(bArr);
                    String str = new String(bArr, i11, 4, StandardCharsets.ISO_8859_1);
                    if (str.equals(VisualSampleEntry.TYPE3)) {
                        TimeToSampleBox timeToSampleBox = (TimeToSampleBox) sampleTableBox.getBoxes(TimeToSampleBox.class).get(i11);
                        TimeToSampleBox timeToSampleBox2 = new TimeToSampleBox();
                        timeToSampleBox2.setFlags(timeToSampleBox.getFlags());
                        timeToSampleBox2.setVersion(timeToSampleBox.getVersion());
                        timeToSampleBox2.setEntries(d1(isoFile));
                        linkedList.remove(timeToSampleBox);
                        linkedList.add(timeToSampleBox2);
                        SyncSampleBox syncSampleBox = (SyncSampleBox) sampleTableBox.getBoxes(SyncSampleBox.class).get(i11);
                        SyncSampleBox syncSampleBox2 = new SyncSampleBox();
                        syncSampleBox2.setFlags(syncSampleBox.getFlags());
                        syncSampleBox2.setVersion(syncSampleBox.getVersion());
                        syncSampleBox2.setSampleNumber(videoRepairActivity.a1());
                        linkedList.remove(syncSampleBox);
                        linkedList.add(syncSampleBox2);
                        SampleSizeBox sampleSizeBox = (SampleSizeBox) sampleTableBox.getBoxes(SampleSizeBox.class).get(i11);
                        SampleSizeBox sampleSizeBox2 = new SampleSizeBox();
                        sampleSizeBox2.setFlags(sampleSizeBox.getFlags());
                        sampleSizeBox2.setSampleSize(0L);
                        sampleSizeBox2.setVersion(sampleSizeBox.getVersion());
                        sampleSizeBox2.setSampleSizes(videoRepairActivity.c1());
                        linkedList.remove(sampleSizeBox);
                        linkedList.add(sampleSizeBox2);
                        SampleToChunkBox sampleToChunkBox = (SampleToChunkBox) sampleTableBox.getBoxes(SampleToChunkBox.class).get(i11);
                        SampleToChunkBox sampleToChunkBox2 = new SampleToChunkBox();
                        sampleToChunkBox2.setFlags(sampleToChunkBox.getFlags());
                        sampleToChunkBox2.setVersion(sampleToChunkBox.getVersion());
                        sampleToChunkBox2.setEntries(videoRepairActivity.f1());
                        linkedList.remove(sampleToChunkBox);
                        linkedList.add(sampleToChunkBox2);
                        List boxes = sampleTableBox.getBoxes(ChunkOffset64BitBox.class);
                        if (boxes == null || boxes.size() <= 0) {
                            ChunkOffsetBox chunkOffsetBox = (ChunkOffsetBox) sampleTableBox.getBoxes(ChunkOffsetBox.class).get(i11);
                            linkedList.remove(chunkOffsetBox);
                            StaticChunkOffsetBox staticChunkOffsetBox = new StaticChunkOffsetBox();
                            staticChunkOffsetBox.setFlags(chunkOffsetBox.getFlags());
                            staticChunkOffsetBox.setVersion(chunkOffsetBox.getVersion());
                            staticChunkOffsetBox.setChunkOffsets(videoRepairActivity.b1());
                            linkedList.add(staticChunkOffsetBox);
                        } else {
                            ChunkOffset64BitBox chunkOffset64BitBox = (ChunkOffset64BitBox) boxes.get(i11);
                            linkedList.remove(chunkOffset64BitBox);
                            ChunkOffset64BitBox chunkOffset64BitBox2 = new ChunkOffset64BitBox();
                            chunkOffset64BitBox2.setFlags(chunkOffset64BitBox.getFlags());
                            chunkOffset64BitBox2.setVersion(chunkOffset64BitBox.getVersion());
                            chunkOffset64BitBox2.setChunkOffsets(videoRepairActivity.b1());
                            linkedList.add(chunkOffset64BitBox2);
                        }
                    } else {
                        if (str.equals(AudioSampleEntry.TYPE3) && !z10) {
                            TimeToSampleBox timeToSampleBox3 = (TimeToSampleBox) sampleTableBox.getBoxes(TimeToSampleBox.class).get(i11);
                            TimeToSampleBox timeToSampleBox4 = new TimeToSampleBox();
                            timeToSampleBox4.setFlags(timeToSampleBox3.getFlags());
                            timeToSampleBox4.setVersion(timeToSampleBox3.getVersion());
                            ArrayList arrayList = new ArrayList();
                            it = it2;
                            movieBox = movieBox2;
                            arrayList.add(new TimeToSampleBox.Entry(videoRepairActivity.f22750y.size(), 1024L));
                            timeToSampleBox4.setEntries(arrayList);
                            linkedList.remove(timeToSampleBox3);
                            linkedList.add(timeToSampleBox4);
                            SampleSizeBox sampleSizeBox3 = (SampleSizeBox) sampleTableBox.getBoxes(SampleSizeBox.class).get(0);
                            SampleSizeBox sampleSizeBox4 = new SampleSizeBox();
                            sampleSizeBox4.setFlags(sampleSizeBox3.getFlags());
                            sampleSizeBox4.setSampleSize(0L);
                            sampleSizeBox4.setVersion(sampleSizeBox3.getVersion());
                            sampleSizeBox4.setSampleSizes(Z0());
                            linkedList.remove(sampleSizeBox3);
                            linkedList.add(sampleSizeBox4);
                            SampleToChunkBox sampleToChunkBox3 = (SampleToChunkBox) sampleTableBox.getBoxes(SampleToChunkBox.class).get(0);
                            SampleToChunkBox sampleToChunkBox4 = new SampleToChunkBox();
                            sampleToChunkBox4.setFlags(sampleToChunkBox3.getFlags());
                            sampleToChunkBox4.setVersion(sampleToChunkBox3.getVersion());
                            sampleToChunkBox4.setEntries(e1());
                            linkedList.remove(sampleToChunkBox3);
                            linkedList.add(sampleToChunkBox4);
                            List boxes2 = sampleTableBox.getBoxes(ChunkOffset64BitBox.class);
                            if (boxes2 == null || boxes2.size() <= 0) {
                                ChunkOffsetBox chunkOffsetBox2 = (ChunkOffsetBox) sampleTableBox.getBoxes(ChunkOffsetBox.class).get(0);
                                linkedList.remove(chunkOffsetBox2);
                                StaticChunkOffsetBox staticChunkOffsetBox2 = new StaticChunkOffsetBox();
                                staticChunkOffsetBox2.setFlags(chunkOffsetBox2.getFlags());
                                staticChunkOffsetBox2.setVersion(chunkOffsetBox2.getVersion());
                                staticChunkOffsetBox2.setChunkOffsets(Y0());
                                linkedList.add(staticChunkOffsetBox2);
                            } else {
                                ChunkOffset64BitBox chunkOffset64BitBox3 = (ChunkOffset64BitBox) boxes2.get(0);
                                linkedList.remove(chunkOffset64BitBox3);
                                ChunkOffset64BitBox chunkOffset64BitBox4 = new ChunkOffset64BitBox();
                                chunkOffset64BitBox4.setFlags(chunkOffset64BitBox3.getFlags());
                                chunkOffset64BitBox4.setVersion(chunkOffset64BitBox3.getVersion());
                                chunkOffset64BitBox4.setChunkOffsets(Y0());
                                linkedList.add(chunkOffset64BitBox4);
                            }
                        }
                        sampleTableBox.setBoxes(linkedList);
                        videoRepairActivity = this;
                        movieBox2 = movieBox;
                        it2 = it;
                        i11 = 0;
                    }
                    movieBox = movieBox2;
                    it = it2;
                    sampleTableBox.setBoxes(linkedList);
                    videoRepairActivity = this;
                    movieBox2 = movieBox;
                    it2 = it;
                    i11 = 0;
                } catch (Exception e10) {
                    e = e10;
                    com.google.firebase.crashlytics.a.b().d(e);
                    wp.a.e(e);
                    return null;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    com.google.firebase.crashlytics.a.b().d(e);
                    wp.a.e(e);
                    return null;
                }
            }
            MovieBox movieBox3 = movieBox2;
            for (MediaHeaderBox mediaHeaderBox : Path.getPaths(isoFile, "/moov[0]/trak/mdia[0]/mdhd[0]")) {
                if (mediaHeaderBox.getTimescale() >= 50000 || z10) {
                    mediaHeaderBox.setDuration(this.f22730e);
                } else {
                    try {
                        long size = this.f22750y.size() * UserVerificationMethods.USER_VERIFY_ALL;
                        this.f22731f = size;
                        mediaHeaderBox.setDuration(size);
                    } catch (Exception e12) {
                        e = e12;
                        com.google.firebase.crashlytics.a.b().d(e);
                        wp.a.e(e);
                        return null;
                    } catch (OutOfMemoryError e13) {
                        e = e13;
                        com.google.firebase.crashlytics.a.b().d(e);
                        wp.a.e(e);
                        return null;
                    }
                }
            }
            for (TrackHeaderBox trackHeaderBox : Path.getPaths(isoFile, "/moov[0]/trak/tkhd[0]")) {
                if (trackHeaderBox.getHeight() > 0.0d) {
                    long jFloor = (long) Math.floor(this.f22730e / 90.0d);
                    this.f22732g = jFloor;
                    trackHeaderBox.setDuration(jFloor);
                } else if (!z10) {
                    long jFloor2 = (long) Math.floor(this.f22731f / 44.1d);
                    this.f22733h = jFloor2;
                    trackHeaderBox.setDuration(jFloor2);
                }
            }
            ((MovieHeaderBox) movieBox3.getBoxes(MovieHeaderBox.class).get(0)).setDuration(Math.max(this.f22732g, this.f22733h));
            LinkedList linkedList2 = new LinkedList(movieBox3.getBoxes());
            List boxes3 = movieBox3.getBoxes(MetaBox.class);
            if (boxes3 == null || boxes3.size() <= 0) {
                i10 = 0;
            } else {
                i10 = 0;
                linkedList2.remove(boxes3.get(0));
            }
            if (z10) {
                List boxes4 = movieBox3.getBoxes(TrackBox.class);
                while (i10 < boxes4.size()) {
                    if (((TrackBox) boxes4.get(i10)).getMediaBox().getHandlerBox().getHandlerType().equals("soun")) {
                        linkedList2.remove((TrackBox) boxes4.get(i10));
                        break;
                    }
                    i10++;
                }
            }
            movieBox3.setBoxes(linkedList2);
            return movieBox3;
        } catch (Exception e14) {
            e = e14;
        } catch (OutOfMemoryError e15) {
            e = e15;
        }
    }

    private long[] Y0() {
        long[] jArr = new long[this.f22749x.size()];
        for (int i10 = 0; i10 < this.f22749x.size(); i10++) {
            jArr[i10] = ((Long) this.f22749x.get(i10)).longValue();
        }
        return jArr;
    }

    private long[] Z0() {
        long[] jArr = new long[this.f22750y.size()];
        for (int i10 = 0; i10 < this.f22750y.size(); i10++) {
            jArr[i10] = ((Integer) this.f22750y.get(i10)).intValue();
        }
        return jArr;
    }

    private long[] a1() {
        long[] jArr = new long[this.f22748w.size()];
        for (int i10 = 0; i10 < this.f22748w.size(); i10++) {
            jArr[i10] = ((Integer) this.f22748w.get(i10)).intValue();
        }
        return jArr;
    }

    private long[] b1() {
        long[] jArr = new long[this.C.size()];
        for (int i10 = 0; i10 < this.C.size(); i10++) {
            jArr[i10] = ((Long) this.C.get(i10)).longValue();
        }
        return jArr;
    }

    private long[] c1() {
        long[] jArr = new long[this.f22751z.size()];
        for (int i10 = 0; i10 < this.f22751z.size(); i10++) {
            jArr[i10] = ((Integer) this.f22751z.get(i10)).intValue();
        }
        return jArr;
    }

    private List d1(IsoFile isoFile) {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        int size = this.C.size();
        int size2 = this.f22749x.size();
        this.f22730e = 0L;
        int i12 = 0;
        if (this.f22750y.size() <= 0) {
            long duration = 3000;
            for (MediaHeaderBox mediaHeaderBox : Path.getPaths(isoFile, "/moov[0]/trak/mdia[0]/mdhd[0]")) {
                if (mediaHeaderBox.getTimescale() > 50000) {
                    duration = mediaHeaderBox.getDuration() / ((SampleSizeBox) ((SampleTableBox) ((MediaInformationBox) mediaHeaderBox.getParent().getBoxes(MediaInformationBox.class).get(0)).getBoxes(SampleTableBox.class).get(0)).getBoxes(SampleSizeBox.class).get(0)).getSampleCount();
                }
            }
            arrayList.add(new TimeToSampleBox.Entry(this.f22751z.size(), duration));
            this.f22730e = ((long) this.f22751z.size()) * duration;
            return arrayList;
        }
        if (size > size2) {
            int iIntValue = ((Integer) this.A.get(0)).intValue() * UserVerificationMethods.USER_VERIFY_ALL;
            int iIntValue2 = 2080 / ((Integer) this.B.get(0)).intValue();
            arrayList.add(new TimeToSampleBox.Entry(((Integer) this.B.get(0)).intValue(), iIntValue2));
            this.f22730e += (long) (((Integer) this.B.get(0)).intValue() * iIntValue2);
            int iFloor = (int) (Math.floor(((((double) iIntValue) * 90.0d) / 44.1d) - ((double) (iIntValue2 * ((Integer) this.B.get(0)).intValue()))) / ((double) ((Integer) this.B.get(1)).intValue()));
            arrayList.add(new TimeToSampleBox.Entry(((Integer) this.B.get(1)).intValue(), iFloor));
            this.f22730e += (long) (((Integer) this.B.get(1)).intValue() * iFloor);
            i12 = 2;
            i10 = iFloor;
            i11 = 1;
        } else {
            i10 = 0;
            i11 = 0;
        }
        while (i12 < size) {
            int iFloor2 = (int) Math.floor(((((double) ((Integer) this.A.get(i11)).intValue()) * 1024.0d) * 90.0d) / (((double) ((Integer) this.B.get(i12)).intValue()) * 44.1d));
            if (iFloor2 == i10) {
                ((TimeToSampleBox.Entry) arrayList.get(arrayList.size() - 1)).setCount(((TimeToSampleBox.Entry) arrayList.get(arrayList.size() - 1)).getCount() + ((long) ((Integer) this.B.get(i12)).intValue()));
            } else {
                arrayList.add(new TimeToSampleBox.Entry(((Integer) this.B.get(i12)).intValue(), iFloor2));
            }
            this.f22730e += (long) (((Integer) this.B.get(i12)).intValue() * iFloor2);
            i11++;
            i12++;
            i10 = iFloor2;
        }
        return arrayList;
    }

    private List e1() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = 0;
        for (int i10 = 0; i10 < this.A.size(); i10++) {
            if (((Integer) this.A.get(i10)).intValue() != iIntValue) {
                iIntValue = ((Integer) this.A.get(i10)).intValue();
                arrayList.add(new SampleToChunkBox.Entry(i10 + 1, iIntValue, 1L));
            }
        }
        return arrayList;
    }

    private List f1() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = 0;
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            if (((Integer) this.B.get(i10)).intValue() != iIntValue) {
                iIntValue = ((Integer) this.B.get(i10)).intValue();
                arrayList.add(new SampleToChunkBox.Entry(i10 + 1, iIntValue, 1L));
            }
        }
        return arrayList;
    }

    private String[] g1() {
        String[] strArr = {MBridgeConstans.ENDCARD_URL_TYPE_PL, jyeoXJ.OVuTJVKnVCJfX};
        if (this.f22743r != null) {
            try {
                IsoFile isoFile = new IsoFile(this.f22743r);
                MovieBox movieBox = isoFile.getMovieBox();
                if (movieBox == null) {
                    strArr[0] = "1";
                    strArr[1] = getString(R.string.reference_status_broken);
                    isoFile.close();
                    return strArr;
                }
                List boxes = movieBox.getBoxes(TrackBox.class);
                if (this.f22737l && this.f22750y.size() > 0 && boxes.size() == 1) {
                    strArr[0] = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                    strArr[1] = getString(R.string.reference_status_no_audio);
                    isoFile.close();
                    return strArr;
                }
                Iterator it = boxes.iterator();
                while (it.hasNext()) {
                    TrackHeaderBox trackHeaderBox = (TrackHeaderBox) ((TrackBox) it.next()).getBoxes(TrackHeaderBox.class).get(0);
                    if (trackHeaderBox.getWidth() > 0.0d && trackHeaderBox.getHeight() > 0.0d) {
                        strArr[1] = ((int) trackHeaderBox.getWidth()) + "x" + ((int) trackHeaderBox.getHeight());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strArr[1]);
                        sb2.append(" (");
                        sb2.append(trackHeaderBox.getWidth() > trackHeaderBox.getHeight() ? "Horizontal" : "Vertical");
                        sb2.append(")");
                        strArr[1] = sb2.toString();
                    }
                }
                if (boxes.size() == 1) {
                    strArr[1] = strArr[1] + ", no audio";
                }
                isoFile.close();
                return strArr;
            } catch (Exception e10) {
                wp.a.e(e10);
            }
        }
        return strArr;
    }

    public static byte[] h1(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    private void i1() {
        this.C = new ArrayList();
        this.f22749x = new ArrayList();
        this.f22750y = new ArrayList();
        this.f22751z = new ArrayList();
        this.B = new ArrayList();
        this.A = new ArrayList();
        this.f22748w = new ArrayList();
    }

    private boolean j1(int i10) {
        long j10 = this.f22729d + ((long) i10) + 1;
        for (int i11 = 0; i11 < 3; i11++) {
            try {
                long j11 = this.f22728c;
                if (j10 == j11) {
                    return true;
                }
                if (j10 >= j11 - 4) {
                    return false;
                }
                this.f22747v.seek(j10);
                if (this.f22747v.read() > 0) {
                    if (i11 == 0) {
                        return false;
                    }
                    byte[] bArr = new byte[4];
                    this.f22747v.seek(j10);
                    this.f22747v.read(bArr);
                    return R0(bArr);
                }
                if (this.f22747v.read() > 15) {
                    if (i11 == 0) {
                        return false;
                    }
                    this.f22747v.seek(j10);
                    byte[] bArr2 = new byte[4];
                    this.f22747v.read(bArr2);
                    return R0(bArr2);
                }
                if (i11 < 2) {
                    this.f22747v.seek(j10);
                    byte[] bArr3 = new byte[4];
                    this.f22747v.read(bArr3);
                    int i12 = Integer.parseInt(U0(Byte.valueOf(bArr3[1])).substring(4) + U0(Byte.valueOf(bArr3[2])) + U0(Byte.valueOf(bArr3[3])), 2);
                    if (i12 < 2) {
                        return false;
                    }
                    j10 += (long) (i12 + 4);
                }
            } catch (IOException e10) {
                wp.a.e(e10);
                return false;
            }
        }
        return true;
    }

    private void k1() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT", (Uri) null);
        intent.setType(MimeTypes.VIDEO_MP4);
        intent.addCategory("android.intent.category.OPENABLE");
        startActivityForResult(intent, 1234);
    }

    public static long l1(byte[] bArr, int i10) {
        return ((long) (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) | ((long) ((bArr[i10] << 24) & (-16777216))) | ((long) ((bArr[i10 + 1] << 16) & 16711680)) | ((long) ((bArr[i10 + 2] << 8) & 65280));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m1(Context context, c cVar) {
        boolean[] zArrT0 = T0();
        if (!zArrT0[0]) {
            return false;
        }
        r1();
        return n1(zArrT0[1], cVar);
    }

    private boolean n1(boolean z10, c cVar) {
        long j10;
        long j11;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f22742q);
            FileChannel channel = fileInputStream.getChannel();
            FileOutputStream fileOutputStream = new FileOutputStream(this.f22744s);
            FileChannel channel2 = fileOutputStream.getChannel();
            long j12 = 10;
            long size = channel.size() / 10;
            int i10 = 0;
            long j13 = 0;
            while (i10 < 11) {
                if (cVar.isCancelled()) {
                    channel.close();
                    channel2.close();
                    fileInputStream.close();
                    fileOutputStream.close();
                    return false;
                }
                if (i10 == 10) {
                    size = channel.size() % j12;
                }
                if (size > 0) {
                    long j14 = j13;
                    j10 = size;
                    channel2.transferFrom(channel, j14, j10);
                    j11 = j14 + j10;
                    cVar.c(((int) ((100 * j11) / channel.size())) + 100);
                } else {
                    long j15 = j13;
                    j10 = size;
                    j11 = j15;
                }
                i10++;
                long j16 = j10;
                j13 = j11;
                size = j16;
                j12 = 10;
            }
            channel.close();
            channel2.close();
            fileInputStream.close();
            fileOutputStream.close();
            if (cVar.isCancelled()) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f22744s, "rw");
            if (this.f22736k == 0) {
                randomAccessFile.seek(this.f22735j);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                byteBufferAllocate.position(0);
                byteBufferAllocate.putInt((int) this.f22734i);
                byteBufferAllocate.position(0);
                randomAccessFile.write(byteBufferAllocate.array());
            } else {
                randomAccessFile.seek(this.f22735j + 8);
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(8);
                byteBufferAllocate2.position(0);
                byteBufferAllocate2.putLong(this.f22734i);
                byteBufferAllocate2.position(0);
                randomAccessFile.write(byteBufferAllocate2.array());
            }
            randomAccessFile.seek(randomAccessFile.length());
            FileChannel channel3 = randomAccessFile.getChannel();
            IsoFile isoFile = new IsoFile(this.f22743r);
            MovieBox movieBoxX0 = X0(isoFile, z10);
            if (movieBoxX0 == null) {
                randomAccessFile.close();
                return false;
            }
            byte[] bArrH1 = h1("6D6F6F76");
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(8);
            byteBufferAllocate3.putInt((int) movieBoxX0.getSize());
            byteBufferAllocate3.put(ByteBuffer.wrap(bArrH1));
            byteBufferAllocate3.position(0);
            channel3.write(byteBufferAllocate3);
            movieBoxX0.writeContainer(channel3);
            channel3.close();
            isoFile.close();
            randomAccessFile.close();
            return true;
        } catch (FileNotFoundException e10) {
            wp.a.e(e10);
            return false;
        } catch (IOException e11) {
            wp.a.e(e11);
            return false;
        }
    }

    private void o1(byte[] bArr, int i10) {
        int i11 = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i11 < i10) {
            if (this.f22740o) {
                return;
            }
            int i16 = i11 - i12;
            if (i16 > 700) {
                i11 = i13 + 1;
                i15--;
                int size = this.f22750y.size();
                if (size > 0) {
                    this.f22750y.remove(size - 1);
                }
                i12 = i14;
            } else if (S0(bArr[i11], bArr[i11 - 1])) {
                int i17 = i11 + HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
                if (i17 < i10 ? Q0(bArr[i11 + 1], bArr[i11 + 2], bArr[i11 + 3], bArr[i11 + 4]) : false) {
                    i15++;
                    this.f22750y.add(Integer.valueOf(i16 + 1));
                    i14 = i12;
                    i12 = i11 + 1;
                } else if (j1(i11)) {
                    this.f22750y.add(Integer.valueOf(i16 + 1));
                    this.A.add(Integer.valueOf(i15 + 1));
                    break;
                } else {
                    i17 = i11 + 1;
                    i11 = i13;
                }
                i13 = i11;
                i11 = i17;
            } else {
                i11++;
            }
        }
        this.f22729d += (long) (i11 + 1);
        this.f22741p = false;
    }

    private void p1() {
        try {
            this.f22747v.seek(this.f22729d);
            int i10 = 0;
            while (this.f22729d < this.f22728c - 4) {
                int i11 = this.f22747v.readInt();
                int i12 = i11 + 4;
                this.f22751z.add(Integer.valueOf(i12));
                i10++;
                if (this.f22747v.readUnsignedShort() == 26040) {
                    this.f22748w.add(Integer.valueOf(this.f22751z.size()));
                }
                this.f22747v.skipBytes(i11 - 2);
                long j10 = this.f22729d + ((long) i12);
                this.f22729d = j10;
                if (j10 < this.f22728c - 4) {
                    boolean z10 = true;
                    if (this.f22747v.read() > 0) {
                        this.f22741p = true;
                    } else {
                        if (this.f22747v.read() <= 15) {
                            z10 = false;
                        }
                        this.f22741p = z10;
                    }
                    if (this.f22741p) {
                        break;
                    } else {
                        this.f22747v.seek(this.f22729d);
                    }
                }
            }
            this.B.add(Integer.valueOf(i10));
        } catch (IOException e10) {
            wp.a.e(e10);
        }
    }

    private void q1() {
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
            aVarL0.C(R.string.repair_title);
        }
    }

    private void r1() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f22742q;
        sb2.append(str.substring(0, str.length() - 4));
        sb2.append("_fixed");
        sb2.append(".mp4");
        this.f22744s = sb2.toString();
        if (new File(this.f22744s).exists()) {
            StringBuilder sb3 = new StringBuilder();
            String str2 = this.f22744s;
            sb3.append(str2.substring(0, str2.length() - 4));
            sb3.append(System.currentTimeMillis());
            sb3.append(".mp4");
            this.f22744s = sb3.toString();
        }
    }

    private void s1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_msg_dont_show_again, (ViewGroup) null);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checkbox);
        ((TextView) viewInflate.findViewById(R.id.tv_msg)).setText(R.string.dialog_repair_warning_msg);
        builder.setIcon(R.drawable.ic_app_icon).setTitle(R.string.repair_title).setView(viewInflate).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: ff.a2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                VideoRepairActivity.z0(this.f38503a, checkBox, dialogInterface, i10);
            }
        }).show();
    }

    private void t1() {
        c cVar = new c();
        this.D = cVar;
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        Bundle bundle = new Bundle();
        bundle.putString("edit_action", "repair");
        FirebaseAnalytics.getInstance(this).a("edit_video", bundle);
    }

    private void u1() {
        if (this.f22743r.equals("unknown")) {
            this.F.B.setEnabled(false);
            this.F.I.setTextColor(androidx.core.content.a.getColor(this, R.color.red_orange));
            this.F.I.setText(R.string.repair_status_no_reference);
            this.F.G.setText("unknown");
            this.F.H.setVisibility(8);
            this.F.A.setText(R.string.select);
            return;
        }
        this.F.G.setText(new File(this.f22743r).getName());
        this.F.H.setVisibility(0);
        String[] strArrG1 = g1();
        if (strArrG1[0].equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
            this.F.B.setEnabled(true);
            this.F.I.setTextColor(androidx.core.content.a.getColor(this, R.color.bright_green));
            this.F.I.setText(R.string.repair_status_ready);
            this.F.H.setText(strArrG1[1]);
            this.F.H.setTextColor(androidx.core.content.a.getColor(this, android.R.color.secondary_text_dark));
        } else {
            this.F.B.setEnabled(false);
            this.F.I.setTextColor(androidx.core.content.a.getColor(this, R.color.red_orange));
            this.F.I.setText(R.string.reference_status_error);
            this.F.H.setText(strArrG1[1]);
            this.F.H.setTextColor(androidx.core.content.a.getColor(this, R.color.red_orange));
        }
        this.F.A.setText(R.string.change);
    }

    public static /* synthetic */ void y0(VideoRepairActivity videoRepairActivity, DialogInterface dialogInterface, int i10) {
        if (videoRepairActivity.D != null && videoRepairActivity.f22739n) {
            videoRepairActivity.F.I.setText(R.string.repair_status_cancel);
            videoRepairActivity.D.cancel(true);
            videoRepairActivity.f22740o = true;
        }
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void z0(VideoRepairActivity videoRepairActivity, CheckBox checkBox, DialogInterface dialogInterface, int i10) {
        videoRepairActivity.getClass();
        if (checkBox.isChecked()) {
            videoRepairActivity.E.j(R.string.pref_dont_show_repair_warning_dialog, false);
        }
        videoRepairActivity.t1();
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) throws Throwable {
        Uri data;
        super.onActivityResult(i10, i11, intent);
        if (i10 != 1234 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        getContentResolver().takePersistableUriPermission(data, 3);
        Bundle bundleC = k0.c(this, data);
        if (bundleC.getBoolean("success")) {
            this.f22743r = bundleC.getString(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        } else {
            this.f22743r = "unknown";
        }
        u1();
    }

    @Override // androidx.activity.p, android.app.Activity
    public void onBackPressed() {
        if (!this.f22739n) {
            finish();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_app_icon);
        builder.setTitle(R.string.cancel);
        builder.setMessage(R.string.dialog_cancel_repair_msg);
        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: ff.c2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                VideoRepairActivity.y0(this.f38510a, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(R.string.f22515no, new DialogInterface.OnClickListener() { // from class: ff.d2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_change) {
            k1();
        } else {
            if (id2 != R.id.btn_repair) {
                return;
            }
            if (this.E.b(R.string.pref_dont_show_repair_warning_dialog, true)) {
                s1();
            } else {
                t1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        AzRecorderApp.d().N(this);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("file path");
        this.f22742q = stringExtra;
        if (stringExtra != null) {
            this.f22745t = new File(this.f22742q);
            this.F = (s0) androidx.databinding.g.j(this, R.layout.activity_video_repair);
            q1();
            this.F.A.setOnClickListener(this);
            this.F.B.setOnClickListener(this);
            ((TextView) findViewById(R.id.tv_corrupted_video)).setText(this.f22745t.getName());
            this.f22743r = P0();
            u1();
        } else {
            finish();
        }
        lf.i.g(lf.l.m(lf.l.a.SHARE), lf.c.n(lf.c.a.SHARE));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
