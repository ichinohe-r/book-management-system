# 書籍管理システム
書籍を管理するシステムです。
書籍の登録・変更・削除、検索ができます。
![71375072-59ff9900-2600-11ea-8a7c-943d3a52dbed](https://user-images.githubusercontent.com/34944205/71427117-b85b7300-26f7-11ea-9ecd-d52f6884ba0a.jpg)
## トップページのURL
http://localhost:9090



## 環境
### 構築
- Spring Boot
### build
- Gradle
### 製造
- Java 8
### テスト
- Groovy
- spock
### ORマッパー
- MyBatis
### 画面
- Thymeleaf
### DB
- h2
  - コンソールのURL
    - http://localhost:9090/h2-console
### ポート設定
自分のマシンに Jenkins を`8080`で立てている都合で`9090`に変更しています。

## 設計思想
![image](https://user-images.githubusercontent.com/34944205/71427111-9feb5880-26f7-11ea-9ad5-7efdbbc800c4.png)

## DB 仕様書
### BOOK_INFO
システムに登録された書籍を管理するテーブルです。

|カラム名|型|説明|データの例|
|--|--|--|--|
|BOOK_MANAGEMENT_NUMBER | INT | PRIMARY KEY , システムの書籍管理番号 |1|
|AUTHOR | VARCHAR |著者|サンプルライター|
|BOOK_TITLE | VARCHAR |書籍名|サンプル書籍|
|PUBLISHER | VARCHAR |発行元|サンプル出版社|
|MANAGEMENT_STATUS | VARCHAR |管理状態|alive -> 管理中,<br>disposal -> 管理外|
|EVENT_DATE_TIME |DATETIME|初回イベントの日時|2019-12-25 08:45:36.122|
|UPDATE_TIME |DATETIME|変更イベントの日時|2019-12-25 08:45:36.122|

### BOOK_MANAGEMENT_EVENT
登録、削除、変更のイベントを記録するテーブルです。

|カラム名|型|説明|データの例|
|--|--|--|--|
EVENT_ID | INT | PRIMARY KEY , システムの管理番号 |1 |
BOOK_MANAGEMENT_NUMBER | INT | システムの書籍管理番号 | 1 |
EVENT_INFO | VARCHAR | イベントの内容 | entry -> 登録,<br>alteration -> 変更,<br>logicalDelete -> 削除（論理削除）|
RECORD_DATE_TIME | DATETIME | イベントが記録された時間 | 2019-12-25 09:00:51.906 |

## プロジェクト起動までの流れ
1. `git clone`でプロジェクトをローカルに持ってくる
1. `IntelliJ`などでプロジェクトを開く
1. `build.gradle`で必要なライブラリなどを取得する
1. `BookManagementSystemApplication`クラスを実行する
1. ブラウザで http://localhost:9090 にアクセスする
