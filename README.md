![image](https://github.com/user-attachments/assets/bcc5b418-f522-474e-ba1a-85e416c5c6d3)
## 予約・問診アプリ  
### 想定機能  
[患者向け]  
・アカウント登録/ログイン<br>  
・診療予約(日時の選択)<br>  
・問診表の入力<br>  
・予約確認/キャンセル<br>  

[クリニック管理者向け]  
・予約一覧の閲覧<br>  
・問診内容の確認<br>  
・状態管理（予約済み/来院済み/キャンセル）<br>   

## ファイル構造
ReservationApp/<br>  
├── src/  
│   ├── app/                      # アプリ起動・メインロジック  <br>
│   │   └── AdminAppMain.java  <br>
|   |   └── UserAppMain.java  <br>
│   ├── controller/             # UIとビジネスロジックの仲介  <br>
│   │   └── ReservationController.java <br> 
│   ├── model/                  # データ構造（DTO）やDBアクセス <br> 
│   │   ├── Reservation.java <br> 
│   │   ├── Inquiry.java <br> 
│   │   ├── Photo.java <br> 
│   │   └── DatabaseManager.java<br>  
│   ├── view/                   # Swingによる画面群 <br> 
│   │   ├── MainMenuView.java  <br>
│   │   ├── ReservationFormView.java  <br>
│   │   ├── InquiryFormView.java <br> 
│   │   ├── ConfirmationView.java <br> 
│   │   └── PhotoUploadView.java  <br>
│   └── util/                   # 共通ユーティリティ（画像保存/OCRなど） <br> 
│       ├── FileUtil.java  <br>
│       └── OCRService.java（※将来的に追加）<br>  
├── resources/                  # 画像ファイル、DBファイル、設定  <br>
│   ├── db/                     # SQLiteなどのDBファイル<br>  
│   └── uploads/                # 写真保存用フォルダ <br> 
├── lib/                        # JDBCドライバなどの外部ライブラリ  <br>
├── README.md <br> 
└── build.gradle / pom.xml      # Gradle or Maven プロジェクト管理ファイル  <br>

## 予約画面情報
予約入力画面↓
![予約用フォーム](https://github.com/user-attachments/assets/7e715345-ef86-4293-978b-d6bed4f564eb)

予約情報確認用画面↓
![予約情報確認用フォーム](https://github.com/user-attachments/assets/4c0393ad-6144-46b6-86e6-ec9841ddb586)

## 追加したい機能・更新したい箇所
・アップロード画像の文字読み取り <br> 
・問診から疾患予測（簡易）<br>  
・スマホのヘルスケアデータからのデータ読み取りと，データからの受診勧奨 <br> 
・ユーザーの受診歴(疾患，処方歴)，健診データをユーザー側で閲覧可能にする  <br>
・洗練されたUI
