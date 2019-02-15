package com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.jwplayer.opensourcedemo.JWPlayerViewExample;
import com.jwplayer.opensourcedemo.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<HolderData> holderDataArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        holderDataArrayList.add(new HolderData("VPAID MDDOK", "608e273c-17a8-432e-a069-7161aaac5079", "5c627cba925cc0b43bcadaab", ""));
        holderDataArrayList.add(new HolderData("Maruti Swift", "2914567a-8e42-4fb2-a616-bd76c1a7b61d", "5c627cba925cc0b43bcadaab", ""));
        holderDataArrayList.add(new HolderData("Vans 2", "0cc97abd-3f58-41cf-9430-fd3a1f897a6b", null, ""));
        holderDataArrayList.add(new HolderData("Vans", "78a7f6ce-8540-4592-8ed4-5c8e1c9d8309", "5c63c834925cc0b43bcadbb9", ""));
        holderDataArrayList.add(new HolderData("American Tourism", "8e087b4b-18c9-4b89-9c89-5cb07b7dc57a", "5c62e5d5925cc0b43bcadb7f", ""));
        holderDataArrayList.add(new HolderData("Marico", "1fa3c7ab-2a19-483d-b8e2-1c566389f6d7", "5c61221c925cc0b43bcad9a6", ""));
        holderDataArrayList.add(new HolderData("Tetrapack new", "0facf877-2929-42a4-84cb-ee5e8603f0b1", "5c092fea925cc0b43bcab184", ""));
        holderDataArrayList.add(new HolderData("Testing", "b4f978a4-d4a9-4586-b296-d483ae89a3b3", "5c5d490c925cc0b43bcad904", ""));
        holderDataArrayList.add(new HolderData("Emirates", "25a71113-396c-4a42-939b-0ecfe8dc927b", "5c5becdc925cc0b43bcad7d6", ""));
        holderDataArrayList.add(new HolderData("Amazon prime", "a50e4183-8cbf-4915-9b42-bd9dc92f567d", "5c5d2038925cc0b43bcad8a7", ""));
        holderDataArrayList.add(new HolderData("Huawei", "31980594-463e-416e-85d2-51dcaed15fd0", "5c5d3a60925cc0b43bcad8f3", ""));
        holderDataArrayList.add(new HolderData("Mahindra XUV", "e79c4e78-8e28-4ce9-8fb2-009ec3b7b3a9", "5c5d3b2d925cc0b43bcad8f8", ""));
        holderDataArrayList.add(new HolderData("Nerolac", "bf2a3718-19b1-4caf-b6f7-fe5f4f15b668", "5c5d1c0d925cc0b43bcad8a5", ""));
        holderDataArrayList.add(new HolderData("WWE", "d04c4923-4a88-4cf1-80c1-e0d67b509833", "5c5a8d05925cc0b43bcad74c", ""));
        holderDataArrayList.add(new HolderData("Yuzu", "3e96c479-9bdd-4d7d-b253-6e0e2f1926ec", "5c592004925cc0b43bcad67d", ""));
        holderDataArrayList.add(new HolderData("Danik Bhaskar", "18cd44fc-35c3-49bf-825c-8146f56ca20c", "5c51869f925cc0b43bcad4c0", ""));
        holderDataArrayList.add(new HolderData("Nutrella", "7443af36-9bc4-40ae-980d-b573ea7b27f8", "5c51311c925cc0b43bcad3e5", ""));
        holderDataArrayList.add(new HolderData("Form Demo", "23fa63e5-5f8d-40a6-b393-b14db37dadc3", "5c53f5016d9d3972a54ba4d2", ""));
        holderDataArrayList.add(new HolderData("Bhaskar", "18cd44fc-35c3-49bf-825c-8146f56ca20c", "5c51869f925cc0b43bcad4c0", ""));
        holderDataArrayList.add(new HolderData("Lodha", "cfc0cfc6-ad42-4eda-b740-15b98b690509", "5c518c44925cc0b43bcad4c1", ""));
        holderDataArrayList.add(new HolderData("Cadbury Celebration", "930ee166-bc8e-418f-a2f2-78ac70de527a", "5c505d6e925cc0b43bcad3be", ""));
        holderDataArrayList.add(new HolderData("Godrej Locks", "46df3e11-439f-4520-aa94-d9c4e80d1471", "5c4eef89925cc0b43bcad287", ""));
        // holderDataArrayList.add(new HolderData("Seekbar marker", "77dd56bb-5f67-4663-bc2f-6a9dc3a9f368", "5c3348b05edeb90762c0245f", ""));
        holderDataArrayList.add(new HolderData("Kwid", "5643b6b6-48b8-4a4e-a9b3-3b72049a2652", "5c4daeeb925cc0b43bcad1c3", ""));
        holderDataArrayList.add(new HolderData("Rasna", "14f24166-ec5e-4522-a067-d8579bee5d8d", "5c4edf6f925cc0b43bcad27c", ""));
        holderDataArrayList.add(new HolderData("Blue Star", "ee5f3453-c4ea-45f1-904f-a8fd1dd7528f", "5c4e9148925cc0b43bcad1c9", ""));
        holderDataArrayList.add(new HolderData("Usha Fan", "38a5f3cd-125a-4f57-b50e-14fab3ab1925", "5c4af332925cc0b43bcad12e", ""));
        holderDataArrayList.add(new HolderData("PillsBury", "3f10ac70-8a62-4e52-ab5e-b9d24aa8be5e", "5c4af3a4925cc0b43bcad12f", ""));
        holderDataArrayList.add(new HolderData("Mayo Clinic", "430110a6-77d7-4f25-8898-bd6440db1b12", "5c486d3c925cc0b43bcad013", ""));
        // holderDataArrayList.add(new HolderData("Don Davis Testing", "219938d2-4b39-44fd-bb4f-6155d06547ed", "5c494c70925cc0b43bcad028", ""));
        //  holderDataArrayList.add(new HolderData("Testing Edit Text", "80344995-98df-4a25-b24a-7a9d8a5b4c31", "5c48327ba1e5767cdb9785e6", ""));
        holderDataArrayList.add(new HolderData("BOB", "ee02dc5c-23a1-4488-ac7a-b1677ee06dbb", "5c48460b925cc0b43bcacfce", ""));
        holderDataArrayList.add(new HolderData("Master Card", "e502952a-3f7f-4897-bbd4-62f177603556", "5c483db9925cc0b43bcacfc4", ""));
        holderDataArrayList.add(new HolderData("Stephen Harper", "e3fb8300-118b-4ba0-9e4b-3f11dd75edd3", "5c26087f925cc0b43bcac05e", ""));
        holderDataArrayList.add(new HolderData("Home Depot", "ddf2a259-9d50-45de-8e16-d4ff3db5b7b9", "5c41c549925cc0b43bcacda6", ""));
        holderDataArrayList.add(new HolderData("Fair & Handsome", "7eeacffc-b174-4861-99dd-85d66d7b0b75", "5c3de060925cc0b43bcacba2", ""));
        holderDataArrayList.add(new HolderData("Rau's IAS 13", "080908f4-2ba9-4c52-a53b-6c143bfb1a68", "5c3dc300925cc0b43bcacb6a", ""));
        holderDataArrayList.add(new HolderData("Rau's IAS 7", "e4845780-7c6f-4aeb-885c-bb941481d43a", "5c3d9bea925cc0b43bcacb3b", ""));
        holderDataArrayList.add(new HolderData("Rau's IAS 6", "2160edbe-9b68-4c75-82ec-16708a43cbce", "5c3891ff925cc0b43bcac7f5", ""));
        // holderDataArrayList.add(new HolderData("Testing Edit Text", "80344995-98df-4a25-b24a-7a9d8a5b4c31", "5c48327ba1e5767cdb9785e6", ""));
        holderDataArrayList.add(new HolderData("Don Davies", "ec3a3955-d909-4d81-9065-f41f629c169c", "5c45ae71925cc0b43bcace8b", ""));
        // holderDataArrayList.add(new HolderData("Tv testing Ravi", "e1f3bf3b-06fe-4607-a8b0-48c380301849", "5c401eb4bd7be531fc27a199", ""));
        holderDataArrayList.add(new HolderData("Emami Laser", "1a017942-4d0b-4891-bc38-abe99d9b2fe7", "5c405797925cc0b43bcaccac", ""));
        holderDataArrayList.add(new HolderData("Havells Grooming Range", "3819d3e3-b7aa-4ac7-95c8-792d443a4bbd", "5c3b49c9925cc0b43bcac9dd", ""));
        holderDataArrayList.add(new HolderData("Havells-Fans", "b3a76be7-18a7-4683-a924-c36a40be07ea", "5c3b4a0f925cc0b43bcac9de", ""));
        holderDataArrayList.add(new HolderData("Standard Electricals", "fb112584-ad44-45a3-95dc-217151aa571d", "5c3b434b925cc0b43bcac9d0", ""));
        holderDataArrayList.add(new HolderData("Lloyd AC", "48b67ff8-90fe-428c-9328-7f20985a5d0a", "5c3b45cb925cc0b43bcac9d3", ""));
        //  holderDataArrayList.add(new HolderData("VOD to Live Testing", "533ccffe-e054-443a-8088-ae32c26fc5c1", "5c35f49bff3c665f5bcbfab4", ""));
        // holderDataArrayList.add(new HolderData("Function Testing", "a5722dbd-575f-4103-b499-50e356beec42", "5c2de96ea2ee9834332b18db", ""));
        holderDataArrayList.add(new HolderData("Sony Liv", "a9df50d5-cb4a-4a0e-8a01-d10a25cb5b04", "5c2330e2925cc0b43bcabe39", ""));
        // holderDataArrayList.add(new HolderData("Poll Rate", "9a8ed325-7050-4b7a-8a4e-880775bb3cef", "5c2c9acd223ec707478af739", ""));
        //  holderDataArrayList.add(new HolderData("Pradeep Testing", "8ddc777b-8fe4-4d8d-a485-ed0580470967", "5c2c6547223ec707478af716", ""));
        //   holderDataArrayList.add(new HolderData("Indian Idol WIth Priority", "", "5c2c4cb6223ec707478af6e9", ""));
        //   holderDataArrayList.add(new HolderData("Testing Jump Seek", "25f735b1-0d2e-42c1-9675-95302f7a50b9", "5c2348d1f89d230a6bae097b", ""));
        //   holderDataArrayList.add(new HolderData("Tv Testing", "797c6f5e-613c-4d1d-9583-77d8f2888271", "5c137507925cc0b43bcab715", ""));
        holderDataArrayList.add(new HolderData("Crap Battles", "b93a54ed-f546-49d2-a217-b1807c5517bd", "5af3f15a8875800bc4c20c12", ""));
        holderDataArrayList.add(new HolderData("Timbak Too", "6be6bee8-66cc-4dcc-b80e-90c34bf31b66", "5af2ad45001a25588e08c4eb", ""));
        holderDataArrayList.add(new HolderData("The Cookery Show", "313ab4d8-7989-42b4-8a36-6b08ef39cf2a", "5af52c2c8875800bc4c20c9e", ""));
        holderDataArrayList.add(new HolderData("Kuch Na Kaho", "517c50f6-7e4b-4619-8f6e-0bdd7e4ddddb", "5af3fa4c8875800bc4c20c15", ""));
        holderDataArrayList.add(new HolderData("Swaminarayan Temple", "6a667074-a8b4-4d33-bbce-9cbfdb0479d3", "5bfd3508925cc0b43bcaaa13", ""));

        holderDataArrayList.add(new HolderData("The Professor", "cc9a7477-e4cf-4955-9110-4330ad5c1c22", "5c04f6bc925cc0b43bcaad1b", ""));
        holderDataArrayList.add(new HolderData("IndusInd4", "e6bf5aba-9fbf-4786-9f9b-a23f97bf3944", "5bd04dfc925cc0b43bcaa05d", ""));
        holderDataArrayList.add(new HolderData("TestAnimation-Vikas", "68730137-025d-4568-b0c6-461c0173f995", "5bbf4696d451d05240cd5dd9", ""));
        holderDataArrayList.add(new HolderData("HDFC Life", "e29184b8-b69d-422d-9695-e9bc0cf54063", "5bfbf52f925cc0b43bcaa999", ""));
        holderDataArrayList.add(new HolderData("Ted Cruz", "f5233094-5dfa-4776-9ed4-1e633daa8252", "5bf56caa925cc0b43bcaa6bd", ""));
        holderDataArrayList.add(new HolderData("The Money Hans", "3ff3dbd1-f74f-4c08-a43d-a11659a8cf23", "5bd98235925cc0b43bcaa159", ""));
        holderDataArrayList.add(new HolderData("Jazz", "563dcee3-fa70-48bf-9b49-d1bc4b9e9c76", "5b87d3be4adb4e22b7fe005b", ""));
        holderDataArrayList.add(new HolderData("Hondacity", "1557ed3c-5220-40b9-a9e6-c8fab5a75a1f", "5b8d02b66d3497ac6eaa30e4", ""));
        holderDataArrayList.add(new HolderData("Jio", "00b9ce6c-f3eb-4d73-bb36-d9f1ba3b68c2", "5b5ee2741b9968ab44736540", ""));
        holderDataArrayList.add(new HolderData("Lava", "3dfa7004-a617-4ac3-b0da-f4c08e2ec3a8", "5b8ab76c6d3497ac6eaa301a", ""));
        holderDataArrayList.add(new HolderData("Canon", "a1d7f4b4-5162-4bb1-ac02-b9fcb09b36a9", "5b63e4ec1e46da7c201f45d9", ""));
        holderDataArrayList.add(new HolderData("Llyod", "80ade1a9-a94c-492f-956a-9e64e1a7381b", "5b8aa3d06d3497ac6eaa2f73", ""));
        holderDataArrayList.add(new HolderData("Flipkart", "4454f2cd-74cf-46c6-93aa-da15fff41f93", "5b56eb2bd889dca769663623", ""));
        holderDataArrayList.add(new HolderData("Grofers", "64ec51b4-d279-4b90-b915-af68fedd9319", "5b8aa4ce6d3497ac6eaa2f79", ""));
        holderDataArrayList.add(new HolderData("CCD", "ea0d6f52-7cc1-4d2b-9b8f-c04d695352d3", "5b852e120f6b9fa131edf6fe", ""));
        holderDataArrayList.add(new HolderData("Kohler", "5b6411e7-23c8-4f39-a3d8-b18bbfbe84c0", "5b8a69276d3497ac6eaa2ed3", ""));
        holderDataArrayList.add(new HolderData("INDUSIND5", "406c14cc-8f97-4be6-ae7e-ad6c28607e4a", "5beea226925cc0b43bcaa395", ""));
        holderDataArrayList.add(new HolderData("INDUSIND4", "5a3d73e1-428e-45a9-ba27-2f0565232f81", "5bc5ea475dd948bbc1fa5fec", ""));
        holderDataArrayList.add(new HolderData("INDUSIND3", "ad6a7b23-3ab7-4b8a-8644-3b92b3bb0d83", "5bc18f714bc0ebdda8f2db88", ""));
        holderDataArrayList.add(new HolderData("INDUSIND2", "8a559a8f-b257-4ab4-b410-b939692b84a3", "5bc0cbf2da5f5052a7b54150", ""));
        holderDataArrayList.add(new HolderData("IndusInd NEW", "8a59fbd4-ebae-4dc7-91e1-819e01d20614", "5bbf2e84d451d05240cd5dce", ""));
        holderDataArrayList.add(new HolderData("NEW IndusInd", "96a22d75-c7e8-426a-8e7c-928dd513c077", "5bc0742c88a6d5b27156410d", ""));
        holderDataArrayList.add(new HolderData("IndusInd", "c53f4bfa-bd95-477e-be68-096f437c2f36", "5bbee0bcd451d05240cd5d99", ""));
        holderDataArrayList.add(new HolderData("Demo Liner1", "c2ccb567-535a-437e-91ee-40a559f760d5", "5b5846c1d889dca769663d63", ""));
        holderDataArrayList.add(new HolderData("Demo Linear2", "1e91d1de-def5-40e8-9738-9992a290c062", "5b604f581b9968ab4473692e", ""));
        holderDataArrayList.add(new HolderData("Demo Linear3", "156abd85-5127-4997-85a1-278e9b3f7f7d", "5b755bd27f84abdf08a0327a", ""));
        holderDataArrayList.add(new HolderData("Demo Linear3", "ff766d5f-70f6-404f-a9be-6896b8ec0381", "5b89055d4adb4e22b7fe01b7", ""));
        holderDataArrayList.add(new HolderData("BMW", "5a9551ce-ad5e-4960-b2a2-fe129ba6a968", "5ad6fc91d61ab486207aa656", ""));
        holderDataArrayList.add(new HolderData("Range Rover", "64f08af0-2dbc-486a-a0be-d0377ee0cb2c", "5b56eaf4d889dca769663622", ""));
        holderDataArrayList.add(new HolderData("Airtel", "f4e5516e-b5ad-4143-88cf-6a90bf724fc1", "5b56ea85d889dca769663621", ""));
        holderDataArrayList.add(new HolderData("Star Plus ", "336e7474-4b4c-4a77-8213-26ee3bc83145", "5b56ed61d889dca769663636", ""));
        holderDataArrayList.add(new HolderData("Nestle ", "ef5d3863-b396-431c-a36e-e39eb2b339cf", "5b56f089d889dca7696636e0", ""));
        holderDataArrayList.add(new HolderData("Scratch & Win (Axis Bank)", "28106c1b-a1fc-4281-9bd6-9ebe0904d544", "5b581905d889dca769663c4a", ""));
        holderDataArrayList.add(new HolderData("Click To Know More (HFFC)", "52618704-cd05-4046-9a35-8568d95535d6", "5b55c13d8088a79709d44f0a", ""));
        holderDataArrayList.add(new HolderData("Click To Call (HFFC)", "273a56c0-a9cc-4847-96bd-2f149ac77037", "5b556bbf8088a79709d44deb", ""));
        holderDataArrayList.add(new HolderData("Capture Email & No (HFFC)", "1ed8d08a-4173-424f-9043-f1c53699473a", "5b55c1e58088a79709d44f0b", ""));
        holderDataArrayList.add(new HolderData("(Virtual Store) Apple", "b0864bef-1afb-4f5b-a9ca-6a1f553cfa25", "5b50bcec8088a79709d44c5e", ""));
        holderDataArrayList.add(new HolderData("Quiz (Flipkart)", "a51d9fe6-6309-4ba2-9699-7c2c0b550ba4", "5b557f7f8088a79709d44e48", ""));
        holderDataArrayList.add(new HolderData("(Option Poll)IDEA", "2ce88957-7a20-4f73-b482-848a48665210", "5b55a96b8088a79709d44e98", ""));
        holderDataArrayList.add(new HolderData("Dynamic Story(Dr. Fixit) ", "dc70eee6-e244-4758-ad4c-b56ea1c6f709", "5b55768b8088a79709d44e2c", ""));
        holderDataArrayList.add(new HolderData("ZARA", "09d29f1f-3161-4696-97b6-98858972d7f3", "5b34d5a4891f5fe8f275aaa3", ""));
        holderDataArrayList.add(new HolderData("Exploring the Coral Reef with Ayan", "48dad5bf-e684-430a-9778-f97ba46f86d6", "5aa66f2ac8e557a52f3ab215" + "", ""));
        holderDataArrayList.add(new HolderData("The Coral Reef", "48dad5bf-e684-430a-9778-f97ba46f86d6", "59c3653bb1092e2db1ef4b93" + "", ""));
        holderDataArrayList.add(new HolderData("Avenger Mashup", "69bf3ee6-5889-4d86-817f-6518c808a793", "599f98dc5be71b687b53d6af", "https://devvtdr.blob.core.windows.net/vdo-tmp/c2arxrxg237eqaor.jpg"));
        holderDataArrayList.add(new HolderData("Justice League", "a493cd38-9404-4762-87ee-538980eb7be0", "59c35b9db1092e2db1ef4b8f", "https://prodvdo.blob.core.windows.net/vdothumb/57ef95153fb50b5c5399dbce/gyptmb2x0l7ooj3nydokcsor.1b79a1386-a489-4963-bc49-d5a0229740e8"));
        holderDataArrayList.add(new HolderData("Zoobi Doobi", "9e40e93d-f852-4659-9efe-0c47b8cff3e5", "5b518aa88088a79709d44c9c", "https://prodvdo.blob.core.windows.net/vdothumb/fmdguu8kwre2pd19y3rg96yldi.jpg"));
        holderDataArrayList.add(new HolderData("The Travel Show Fillipino Factor", "c2b0cef4-c8a3-4c1a-b658-4b4afc62ed15", "59b3c8672831fcfabe7a3f9a", ""));
        holderDataArrayList.add(new HolderData("Club Mahindra", "b27da353-095e-4840-a5b9-a37e9481c6ab", "5b0d174124b1b48f40bf0aa7", ""));
        holderDataArrayList.add(new HolderData("Six Sigma", "47d8483f-6dd2-470d-8b4b-c5e86c2357b5", "5b0d163524b1b48f40bf0aa2", ""));
        holderDataArrayList.add(new HolderData("POKKT", "b828cc0a-603e-4f9b-ad21-92080f5e7cb4", "5ae6e9bab29be67b24ab578a", ""));
        holderDataArrayList.add(new HolderData("BJP-India", "ceead08e-8b06-4ea8-89bb-9aa5e8a47a38", "5b3606f76751da77484105c4", ""));
        holderDataArrayList.add(new HolderData("Sun Siyan", "f2d0739b-ceaf-4ec3-a62d-6541635f2f3d", "5b0d28de24b1b48f40bf0ae0", ""));

        holderDataArrayList.add(new HolderData("BJD", "d40de890-10ae-4e0f-82e9-2f26215eb94b", "5a7c5d4e880f2288a38e6ad9", ""));
        holderDataArrayList.add(new HolderData("BJP 2019 New", "66644ac0-c5d4-4884-83db-c8182abd0b5d", "5b8f95f4b40e7ff7f1e2810b", ""));
        holderDataArrayList.add(new HolderData("Indian Idol", "034875a8-1205-4116-8407-374f5ca9088e", "5b9124bd10bc41036c0b676a", ""));

        final ListView listView = findViewById(R.id.listView);
        listView.setAdapter(new MyListAdapter());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    HolderData holderData = holderDataArrayList.get((int) view.getTag());
                    Intent intent = new Intent(MainActivity.this, JWPlayerViewExample.class);
                    intent.putExtra("VIDEO_ID", holderData.getVideoId());
                    intent.putExtra("JSON_ID", holderData.getJsonId());
                   // intent.putExtra("VAST_URL", holderData.getVastUrl());
                    startActivity(intent);
                } catch (Exception e) {
                    //e.printStackTrace();
                }
            }
        });
    }

    class MyListAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return holderDataArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(MainActivity.this).inflate(android.R.layout.simple_expandable_list_item_1, parent, false);
            }
            TextView textView = (TextView) convertView;
            HolderData holderData = holderDataArrayList.get(position);
            textView.setText(holderData.getName());
            textView.setTag(position);
            return convertView;
        }
    }

    class HolderData {
        String name;
        String vastUrl;
        String videoId;
        String jsonId;
        String thumbnail;

        public HolderData(String name, String videoId, String jsonId, String thumbnail) {
            this.name = name;
            this.videoId = videoId;
            this.jsonId = jsonId;
            this.thumbnail = thumbnail;
        }

        public HolderData(String name, String vastUrl) {
            this.name = name;
            this.vastUrl = vastUrl;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public String getName() {
            return name;
        }

        public String getVastUrl() {
            return vastUrl;
        }

        public String getVideoId() {
            return videoId;
        }

        public String getJsonId() {
            return jsonId;
        }
    }
}

