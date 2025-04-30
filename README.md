
## 予約・問診アプリ
### 想定機能
[患者向け]
・アカウント登録/ログイン
・診療予約(日時の選択)
・問診表の入力
・予約確認/キャンセル

[クリニック管理者向け]
・予約一覧の閲覧
・問診内容の確認
・状態管理（予約済み/来院済み/キャンセル）

## ファイル構造
ReservationApp/
├── src/
│   ├── app/                    # アプリ起動・メインロジック
│   │   └── AdminAppMain.java
|   |   └── UserAppMain.java
│   ├── controller/             # UIとビジネスロジックの仲介
│   │   └── ReservationController.java
│   ├── model/                  # データ構造（DTO）やDBアクセス
│   │   ├── Reservation.java
│   │   ├── Inquiry.java
│   │   ├── Photo.java
│   │   └── DatabaseManager.java
│   ├── view/                   # Swingによる画面群
│   │   ├── MainMenuView.java
│   │   ├── ReservationFormView.java
│   │   ├── InquiryFormView.java
│   │   ├── ConfirmationView.java
│   │   └── PhotoUploadView.java
│   └── util/                   # 共通ユーティリティ（画像保存/OCRなど）
│       ├── FileUtil.java
│       └── OCRService.java（※将来的に追加）
├── resources/                  # 画像ファイル、DBファイル、設定
│   ├── db/                     # SQLiteなどのDBファイル
│   └── uploads/                # 写真保存用フォルダ
├── lib/                        # JDBCドライバなどの外部ライブラリ
├── README.md
└── build.gradle / pom.xml      # Gradle or Maven プロジェクト管理ファイル

## 追加したい機能
・アップロード画像の文字読み取り
・問診から疾患予測（簡易）
・スマホのヘルスケアデータからのデータ読み取りと，データからの受診勧奨
・ユーザーの受診歴(疾患，処方歴)，健診データをユーザー側で閲覧可能にする