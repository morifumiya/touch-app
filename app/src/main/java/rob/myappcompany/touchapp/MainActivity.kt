package rob.myappcompany.touchapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. id を取得(View を取得しますよ、idで)
        val tx: TextView = findViewById(R.id.tv)
        val btn1: Button = findViewById(R.id.btnModel)
        val btn2: Button = findViewById(R.id.btnView)
        val btn3: Button = findViewById(R.id.btnViewModel)

        // 2. クリック処理
        btn1.setOnClickListener {
            // 押した時の処理
            tx.text = "Model : 具体的なビジネスロジックを担当。\nデータベース操作や外部通信、データ保持、計算など。"
        }

        btn2.setOnClickListener {
            // 押した時の処理
            tx.text = "View : UIの定義と、UIへの入出力を担当。\nAndroidでいうと、layoutのxmlと、ActivityやFragmentにあたります。"
        }

        btn3.setOnClickListener {
            // 押した時の処理
            tx.text = "ViewModel：ViewとModel間で、情報を加工・伝達する役割を担います。\n１つのViewに対応した１つのViewModelが存在します。"
        }

    }
}
