package com.example.objectdetectionfinaldraft.customview;

import java.util.List;
import com.example.objectdetectionfinaldraft.tflite.Classifier.Recognition;

public interface ResultsView {
    public void setResults(final List<Recognition> results);
}