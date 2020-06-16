package dam.android.raul.u3_t1;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LogActivity extends Activity
{
    private static String nombre;
    private static final String kDEBUG_TAG="LOG - "+nombre;


    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params)
    {
        super.addContentView(view, params);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        nombre=String.valueOf(this.getClass());
        Log.i(kDEBUG_TAG,"onCreate"+nombre);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        nombre=String.valueOf(this.getClass());
        Log.i(kDEBUG_TAG,"onStart"+nombre);
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(kDEBUG_TAG,"onStop"+nombre);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(kDEBUG_TAG,"onPause"+nombre);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(kDEBUG_TAG,"onResume"+nombre);
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(kDEBUG_TAG,"onRestart"+nombre);
    }


    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(kDEBUG_TAG,"OnDestroy"+nombre);
    }

    @Override
    public boolean isFinishing()
    {
        Log.i(kDEBUG_TAG,"Finishing"+nombre);
        return super.isFinishing();
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState)
    {
        Log.i(kDEBUG_TAG,"onRestoreInstanceState"+nombre +savedInstanceState.getString("cuenta"));
        TextView tvDisplay=findViewById(R.id.tvDisplay);
        tvDisplay.setVisibility(View.VISIBLE);
        tvDisplay.setText(savedInstanceState.getString("cuenta"));


        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState)
    {
        Log.i(kDEBUG_TAG,"onSaveInstanceState"+nombre);

        super.onSaveInstanceState(outState, outPersistentState);
        TextView tvDisplay=findViewById(R.id.tvDisplay);
        outState.putString("cuenta",tvDisplay.getText().toString());
    }

}
