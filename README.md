### Splash Screen Yapımı:
Res klasörü altına animasyon klasörü oluşturup içine mytrasition.xml dosyasını  ekliyoruz




<alpha

    android:fromAlpha="0.0"
    android:toAlpha="1.0"
    android:duration="2000"
    
    />
  
  
2.Adım:
SplashScreen.java dosyası içine kodlarımızı ekliyoruz

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img =(ImageView) findViewById(R.id.img);
        text =(TextView) findViewById(R.id.text);

        Animation manim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        text.startAnimation(manim);
        img.startAnimation(manim);

        final Intent i = new Intent(this,AnaSayfa.class);

        Thread timer = new Thread(){

            public  void  run() {

                try {
                    sleep(4000);
                } catch (InterruptedException e ){

                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }

            }


        };
        timer.start();
    }
}

	
	
