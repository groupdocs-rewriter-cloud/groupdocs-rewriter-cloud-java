

# ParaphraseTextRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **String** | Set language of text |  |
|**text** | **String** | Single text paragraph |  [optional] |
|**texts** | **List&lt;String&gt;** | Text paragraphs |  [optional] |
|**origin** | **String** | Information about SDK user, like a User-Agent |  [optional] |
|**detectLanguage** | **Boolean** | If language should be auto detected |  [optional] |
|**suggestions** | [**SuggestionsEnum**](#SuggestionsEnum) | Number of variants for rewriting |  [optional] |
|**diversityDegree** | **DegreeEnum** |  |  [optional] |
|**tokenize** | **Boolean** | Determines whether to return a tokens list |  [optional] |



## Enum: SuggestionsEnum

| Name | Value |
|---- | -----|
| ONE | &quot;One&quot; |
| TWO | &quot;Two&quot; |
| THREE | &quot;Three&quot; |



