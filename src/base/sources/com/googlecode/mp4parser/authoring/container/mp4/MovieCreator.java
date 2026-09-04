package com.googlecode.mp4parser.authoring.container.mp4;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Mp4TrackImpl;
import com.googlecode.mp4parser.util.Path;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MovieCreator {
    public static Movie build(String str) {
        return build(new FileDataSourceImpl(new File(str)));
    }

    public static Movie build(DataSource dataSource) {
        IsoFile isoFile = new IsoFile(dataSource);
        Movie movie = new Movie();
        for (TrackBox trackBox : isoFile.getMovieBox().getBoxes(TrackBox.class)) {
            SchemeTypeBox schemeTypeBox = (SchemeTypeBox) Path.getPath((AbstractContainerBox) trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
            if (schemeTypeBox == null || !(schemeTypeBox.getSchemeType().equals(C.CENC_TYPE_cenc) || schemeTypeBox.getSchemeType().equals(C.CENC_TYPE_cbc1))) {
                movie.addTrack(new Mp4TrackImpl(String.valueOf(dataSource.toString()) + "[" + trackBox.getTrackHeaderBox().getTrackId() + "]", trackBox, new IsoFile[0]));
            } else {
                movie.addTrack(new CencMp4TrackImplImpl(String.valueOf(dataSource.toString()) + "[" + trackBox.getTrackHeaderBox().getTrackId() + "]", trackBox, new IsoFile[0]));
            }
        }
        movie.setMatrix(isoFile.getMovieBox().getMovieHeaderBox().getMatrix());
        return movie;
    }
}
